package com.liucan.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSONObject;
import com.liucan.common.dubbo.BootDubboServiceImpl;
import com.liucan.common.redis.JedisCluster;
import com.liucan.common.redis.RedisPubSub;
import com.liucan.common.response.CommonResponse;
import com.liucan.domain.Person;
import com.liucan.service.UserInfoJdbcTemplateService;
import com.liucan.service.UserInfoMybatisService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private UserInfoJdbcTemplateService userInfoJdbcTemplateService;
    @Autowired
    private UserInfoMybatisService userInfoMybatisService;
    @Autowired
    private JedisCluster jedisCluster;
    @Autowired
    private KafkaTemplate kafkaTemplate;
    @Reference
    private BootDubboServiceImpl bootDubboService;
    @Autowired
    private RedisPubSub redisPubSub;

    @Cacheable(value = "userInfo")
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
        jedisCluster.set(key, CommonResponse.ok(value));
        return CommonResponse.ok();
    }

    @GetMapping("/redis_set")
    public Object redisSet(@RequestParam("key") String key) {
        return jedisCluster.get(key);
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
        return CommonResponse.ok(kafkaTemplate.send(kafkaTemplate.getDefaultTopic(), key, json));
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
}

