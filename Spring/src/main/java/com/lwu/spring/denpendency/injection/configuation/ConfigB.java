package com.lwu.spring.denpendency.injection.configuation;

import com.lwu.spring.appevents.CStartEventHandler;
import com.lwu.spring.appevents.CStopEventHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Leon on 5/29/16.
 */
@Configuration
@Import(ConfigA.class)
public class ConfigB {

    @Bean
    public B b() {
        return new B();
    }

    @Bean
    public CStartEventHandler cStartEventHandler() {
        return new CStartEventHandler();
    }

    @Bean
    public CStopEventHandler cStopEventHandlerntHandler() {
        return new CStopEventHandler();
    }
}
