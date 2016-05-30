package com.lwu.spring.denpendency.injection.annotation;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Leon on 5/29/16.
 */
public class Book {
    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    private String name;


}
