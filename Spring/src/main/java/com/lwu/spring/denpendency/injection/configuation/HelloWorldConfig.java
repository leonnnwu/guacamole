package com.lwu.spring.denpendency.injection.configuation;

import com.lwu.spring.helloworld.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Leon on 5/29/16.
 */
@Configuration
public class HelloWorldConfig {

    @Bean
    public HelloWorld helloWorld() {
        return new HelloWorld();
    }
}
