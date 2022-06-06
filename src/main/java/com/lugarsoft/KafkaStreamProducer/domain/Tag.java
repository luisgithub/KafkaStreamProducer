package com.lugarsoft.KafkaStreamProducer.domain;


import lombok.Data;
import lombok.ToString;
import lombok.Value;

@Data
@Value
@ToString
public class Tag {
    private String description;
    private Double price;
}
