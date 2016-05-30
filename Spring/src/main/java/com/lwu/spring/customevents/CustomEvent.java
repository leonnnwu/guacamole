package com.lwu.spring.customevents;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Leon on 5/30/16.
 */
public class CustomEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public CustomEvent(Object source) {
        super(source);
    }

    public String toString() {
        return "My custom Event";
    }
}
