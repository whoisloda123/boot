package com.liucan.boot.web.controller;

import com.alibaba.fastjson.JSONObject;
import com.liucan.boot.framework.annotation.LoginCheck;
import com.liucan.boot.framework.annotation.UserId;
import com.liucan.boot.framework.config.CachingConfig;
import com.liucan.boot.mode.Person;
import com.liucan.boot.service.UserInfoJdbcTemplateService;
import com.liucan.boot.service.UserInfoMybatisService;
import com.liucan.boot.service.dubbo.BootDubboServiceImpl;
import com.liucan.boot.service.kafka.KafkaService;
import com.liucan.boot.service.redis.LedisCluster;
import com.liucan.boot.service.redis.RedisPubSub;
import com.liucan.boot.service.redis.RedisTemplateService;
import com.liucan.boot.web.common.CommonResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: liucan
 * @Date: 2018/7/6
 * @Description:
 */
@Slf4j
@RestController
@RequestMapping("/bootlearn")
public class MyRestController {
    private final UserInfoJdbcTemplateService userInfoJdbcTemplateService;
    private final UserInfoMybatisService userInfoMybatisService;
    private final LedisCluster ledisCluster;
    private final KafkaTemplate kafkaTemplate;
    private final BootDubboServiceImpl bootDubboService;
    private final RedisPubSub redisPubSub;
    private final RedisTemplateService redisTemplateService;
    private final KafkaService kafkaService;

    public MyRestController(UserInfoJdbcTemplateService userInfoJdbcTemplateService,
                            UserInfoMybatisService userInfoMybatisService,
                            LedisCluster ledisCluster,
                            KafkaTemplate kafkaTemplate,
                            BootDubboServiceImpl bootDubboService,
                            RedisPubSub redisPubSub,
                            RedisTemplateService redisTemplateService,
                            KafkaService kafkaService) {
        this.userInfoJdbcTemplateService = userInfoJdbcTemplateService;
        this.userInfoMybatisService = userInfoMybatisService;
        this.ledisCluster = ledisCluster;
        this.kafkaTemplate = kafkaTemplate;
        this.bootDubboService = bootDubboService;
        this.redisPubSub = redisPubSub;
        this.redisTemplateService = redisTemplateService;
        this.kafkaService = kafkaService;
    }

    @Cacheable(cacheNames = CachingConfig.ENTRY_TTL_1M, cacheManager = "redisCacheManager", keyGenerator = "keyGenerator")
    @GetMapping("/find_name")
    public String findName(@RequestParam("user_id") Integer userId) {
        return userInfoJdbcTemplateService.queryUser(userId);
    }

    @GetMapping("/find_name1")
    public CommonResponse findName1(@RequestParam("user_id") Integer userId) {
        return userInfoMybatisService.getName(userId);
    }

    @Cacheable(value = "userInfo")
    @GetMapping("/find_phone")
    public CommonResponse findPhone(@RequestParam("user_id") Integer userId) {
        return userInfoMybatisService.getUserPhone(userId);
    }

    @PostMapping("/redis_set")
    public CommonResponse redisSet(@RequestParam("key") String key,
                                   @RequestParam("value") String value) {
        ledisCluster.set(key, CommonResponse.ok(value));
        return CommonResponse.ok();
    }

    @GetMapping("/redis_set")
    public Object redisSet(@RequestParam("key") String key) {
        return ledisCluster.get(key);
    }

    @PostMapping("kafka")
    public CommonResponse kafka() {
        Person person = new Person();
        person.setAge(12);
        person.setName("liucan");
        person.setAddress("重庆市");
        String json = JSONObject.toJSONString(person);
        String key = "student";
        log.info("[kafka]发送kafka消息topic:{}, key:{}, data：{}", kafkaTemplate.getDefaultTopic(), key, json);
        kafkaTemplate.send(kafkaTemplate.getDefaultTopic(), key, json);
        kafkaService.send("test-topic", key, json);

        return CommonResponse.ok();
    }

    @GetMapping("dubbo")
    public CommonResponse dubbo(@RequestParam("user_id") Integer userId) {
        return CommonResponse.ok(bootDubboService.getUserName(userId));
    }

    @GetMapping("redisPubSub")
    public CommonResponse redisPubSub(@RequestParam("message") String message) {
        redisPubSub.publish(CommonResponse.ok(message));
        return CommonResponse.ok();
    }

    @GetMapping("spring-redis")
    public CommonResponse springRedis() {
        redisTemplateService.SpringRedis();
        return CommonResponse.ok();
    }

    @GetMapping("annotaiton")
    @LoginCheck
    public CommonResponse annotaiton(@UserId Integer userId) {
        return CommonResponse.ok(userId);
    }
}

