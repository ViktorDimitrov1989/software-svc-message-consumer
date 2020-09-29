package com.vd.consumer.ops;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class EventsConfiguration {

    @Bean
    public Consumer<String> consumer() {
        //TODO: update logic to handle consumed message
        return System.out::println;
    }
}
