package com.liucan.config;

import com.liucan.common.redis.Ledis;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.RedisPassword;
import org.springframework.data.redis.connection.RedisStandaloneConfiguration;
import org.springframework.data.redis.connection.jedis.JedisClientConfiguration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;
import redis.clients.jedis.JedisPoolConfig;

import java.time.Duration;

/**
 * @author liucan
 * @date 2018/7/1
 * @brief redis配置
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "redis")
@PropertySource(value = "classpath:properties/redis.properties")
public class RedisConfig {
    private String ip;
    private Integer port;
    private String password;
    private String expire;
    private Long timeout;

    //连接池配置
    private Integer maxIdle;
    private Integer maxTotal;
    private Integer maxWaitMillis;
    private Integer minEvictableIdleTimeMillis;
    private Integer numTestsPerEvictionRun;
    private Long timeBetweenEvictionRunsMillis;
    private Boolean testOnBorrow;
    private Boolean testWhileIdle;

    //哨兵，集群
    private String clusterNodes; //集群
    private Integer clusterMaxRedirects; //集群

    /**
     * JedisPoolConfig 连接池
     */
    @Bean
    public JedisPoolConfig jedisPoolConfig() {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        //最大空闲数
        jedisPoolConfig.setMaxIdle(maxIdle);
        //连接池的最大数据库连接数
        jedisPoolConfig.setMaxTotal(maxTotal);
        //最大建立连接等待时间
        jedisPoolConfig.setMaxWaitMillis(maxWaitMillis);
        //逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
        jedisPoolConfig.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
        //每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
        jedisPoolConfig.setNumTestsPerEvictionRun(numTestsPerEvictionRun);
        //逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
        jedisPoolConfig.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
        //是否在从池中取出连接前进行检验,如果检验失败,则从池中去除连接并尝试取出另一个
        jedisPoolConfig.setTestOnBorrow(testOnBorrow);
        //在空闲时检查有效性, 默认false
        jedisPoolConfig.setTestWhileIdle(testWhileIdle);
        return jedisPoolConfig;
    }

    /**
     * 单机版配置
     */
    @Bean
    public JedisConnectionFactory jedisConnectionFactory() {
        RedisStandaloneConfiguration standaloneConfiguration = new RedisStandaloneConfiguration();
        standaloneConfiguration.setHostName(ip);
        standaloneConfiguration.setPassword(RedisPassword.of(password));
        standaloneConfiguration.setPort(port);

        JedisClientConfiguration.JedisClientConfigurationBuilder jedisClientConfiguration = JedisClientConfiguration.builder();
        //超时
        jedisClientConfiguration.connectTimeout(Duration.ofMillis(timeout));
        return new JedisConnectionFactory(standaloneConfiguration, jedisClientConfiguration.build());
    }

    /**
     * 实例化RedisTemplate对象
     */
    @Bean
    public RedisTemplate<String, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<>();
        initDomainRedisTemplate(redisTemplate, redisConnectionFactory);
        return redisTemplate;
    }

    /**
     * 设置数据存入 redis 的序列化方式,并开启事务
     *
     * @param redisTemplate
     * @param factory
     */
    private void initDomainRedisTemplate(RedisTemplate<String, Object> redisTemplate, RedisConnectionFactory factory) {
        //如果不配置Serializer，那么存储的时候缺省使用String，如果用User类型存储，那么会提示错误User can't cast to String！
        redisTemplate.setKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashKeySerializer(new StringRedisSerializer());
        redisTemplate.setHashValueSerializer(new GenericJackson2JsonRedisSerializer());
        redisTemplate.setValueSerializer(new GenericJackson2JsonRedisSerializer());
        //开启事务
        redisTemplate.setEnableTransactionSupport(true);
        redisTemplate.setConnectionFactory(factory);
    }

    /**
     * 实例化Ledis对象
     */
    @Bean("ledis")
    public Ledis ledis(RedisTemplate<String, Object> redisTemplate) {
        Ledis ledis = new Ledis();
        ledis.setRedisTemplate(redisTemplate);
        return ledis;
    }
}
