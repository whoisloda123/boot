package com.liucan.boot.service.kafka;

import com.liucan.boot.service.kafka.common.AbstractKafkaConsumerLogger;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * A类型日志消费者
 *
 * @author liucan
 * @version 19-5-15
 */
@Service
@Slf4j
public class KafkaConsumerLoggerA extends AbstractKafkaConsumerLogger {
    @Override
    public void process(String message) {
        log.info("[A类型日志业务]收到日志消息了，message:{}", message);
    }
}
