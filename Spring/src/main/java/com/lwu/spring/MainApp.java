package com.lwu.spring;

import com.lwu.spring.helloworld.HelloUSA;
import com.lwu.spring.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Leon on 5/29/16.
 */
public class MainApp {

    public static void main(String[] args) {
        testDependencyInjectionConstructorBased();
    }

    private static void testDependencyInjectionConstructorBased() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Beans.xml");
    }

    private static void testBeanScope() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld/Beans.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        helloWorld.setMessage1("Hello World 1");
        helloWorld.getMessage1();

        HelloWorld helloWorld2 = context.getBean("helloWorld", HelloWorld.class);

        helloWorld2.getMessage1();

        context.registerShutdownHook();
    }

    private static void testBeanDefinitionInheritance() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("helloworld/Beans.xml");

        HelloWorld helloWorld = context.getBean("helloWorld", HelloWorld.class);

        helloWorld.getMessage1();
        helloWorld.getMessage2();

        HelloUSA objB = context.getBean("helloUSA", HelloUSA.class);
        objB.getMessage1();
        objB.getMessage2();
        objB.getMessage3();
    }
}
