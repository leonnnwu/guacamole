package com.lwu.spring.helloworld;

/**
 * Created by Leon on 5/29/16.
 */
public class HelloWorld {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

}
