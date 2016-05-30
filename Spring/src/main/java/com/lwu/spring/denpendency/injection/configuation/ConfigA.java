package com.lwu.spring.denpendency.injection.configuation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Leon on 5/29/16.
 */
@Configuration
public class ConfigA {

    @Bean(initMethod = "init", destroyMethod = "cleanup")
    @Scope("singleton")
    public A a() {
        return new A();
    }
}
