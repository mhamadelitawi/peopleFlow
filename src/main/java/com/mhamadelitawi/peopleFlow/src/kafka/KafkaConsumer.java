package com.mhamadelitawi.peopleFlow.src.kafka;

import com.mhamadelitawi.peopleFlow.src.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @Autowired
    private EmployeeService service;

    @KafkaListener(topics = "TOPIC-DEMO" )
    public void consume(String message) {
        service.saveEmployee(message);
    }
}