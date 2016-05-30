package com.lwu.spring.customevents;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Leon on 5/30/16.
 */
@Configuration
public class CustomEventConfig {

    @Bean
    public CustomEventHandler customEventHandler() {
        return new CustomEventHandler();
    }

    @Bean
    public CustomEventPublisher customEventPublisher() {
        return new CustomEventPublisher();
    }
}
