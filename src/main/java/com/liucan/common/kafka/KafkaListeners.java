package com.liucan.common.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author liucan
 * @date 2018/7/29
 * @brief kafka监听topic
 */
@Slf4j
@Component
public class KafkaListeners {

    @KafkaListener(topics = "${spring.kafka.template.default-topic}")
    public void processMessage(ConsumerRecord<?, ?> record) {
        log.info("[kafka]接受到kafka消息topic:{}, record:{}", record.topic(), record);
    }
}
