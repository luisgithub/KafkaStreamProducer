package com.lugarsoft.KafkaStreamProducer.controller;

import com.lugarsoft.KafkaStreamProducer.domain.Tag;
import com.lugarsoft.KafkaStreamProducer.service.TagStreamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/stream")
public class TagStreamController {

    @Autowired
    private TagStreamService tagStreamService;

    @PostMapping
    public ResponseEntity createStreamFromRequest(@RequestBody List<Tag> tagList) {
        tagStreamService.createTagStream(tagList);
        return ResponseEntity.ok(tagList.size() +" items converted to a Stream and sent successfully to kafka instance..");
    }
}
