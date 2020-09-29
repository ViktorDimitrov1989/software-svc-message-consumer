package com.vd.consumer.controllers;

import com.vd.consumer.domain.Message;
import com.vd.consumer.repositories.MessageReaderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@Slf4j
@RestController
@RequestMapping("/consumer")
public class ConsumerResource {

    private MessageReaderRepository messageReaderRepository;

    public ConsumerResource(MessageReaderRepository messageReaderRepository) {
        this.messageReaderRepository = messageReaderRepository;
    }

    @RequestMapping(value = "/receive", method = RequestMethod.GET)
    public ResponseEntity<Flux<Message>> getMessages() {
        try {
            return ResponseEntity.ok()
                    .body(messageReaderRepository
                            .findAll());
        } catch (Exception e) {
            log.error(e.getMessage());
            return null;
        }
    }
}
