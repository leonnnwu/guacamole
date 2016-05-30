package com.lwu.spring.aspectj;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Leon on 5/30/16.
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = {"com.lwu.spring.aspectj"})
public class AspectJConfig {
}
