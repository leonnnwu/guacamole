package com.lwu.spring.helloworld;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Leon on 5/29/16.
 */
public class HelloWorld implements InitializingBean, DisposableBean{

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    @Override
    public void destroy() throws Exception{
        System.out.println("Bean will destroy now.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is going through init.");
    }
}
