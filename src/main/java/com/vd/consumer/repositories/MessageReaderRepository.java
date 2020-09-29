package com.vd.consumer.repositories;

import com.vd.consumer.domain.Message;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface MessageReaderRepository
        extends org.springframework.data.repository.Repository<Message, String> {

    Flux<Message> findAll();

}
