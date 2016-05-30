package com.lwu.spring.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Leon on 5/29/16.
 */
public class MainApp {

    public static void main(String[] args) {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld/Beans.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        helloWorld.setMessage("Hello World 1");
        helloWorld.getMessage();

        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);

        helloWorld2.getMessage();

        context.registerShutdownHook();
    }
}
