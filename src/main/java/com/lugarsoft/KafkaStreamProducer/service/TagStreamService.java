package com.lugarsoft.KafkaStreamProducer.service;

import com.lugarsoft.KafkaStreamProducer.domain.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
public class TagStreamService {

    @Value("${topic.name}")
    private String topicName;

    @Autowired private KafkaTemplate<String, List<Tag>> kafkaTemplate;

    public void createTagStream(List<Tag> tagList){
        String streamId = UUID.randomUUID().toString();
        kafkaTemplate.send(topicName, streamId, tagList);
        log.info("Sending Stream Id: {}", streamId);
        log.info("Sending stream Body: {}", tagList );
    }


}
