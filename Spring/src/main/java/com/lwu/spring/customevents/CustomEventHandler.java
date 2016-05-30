package com.lwu.spring.customevents;

import org.springframework.context.ApplicationListener;

/**
 * Created by Leon on 5/30/16.
 */
public class CustomEventHandler implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println(event.toString());
    }
}
