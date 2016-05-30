package com.lwu.spring;

import com.lwu.spring.denpendency.injection.annotation.Profile;
import com.lwu.spring.denpendency.injection.beanreference.TextEditor;
import com.lwu.spring.denpendency.injection.collection.JavaCollection;
import com.lwu.spring.denpendency.injection.annotation.Student;
import com.lwu.spring.denpendency.injection.configuation.*;
import com.lwu.spring.helloworld.HelloUSA;
import com.lwu.spring.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Leon on 5/29/16.
 */
public class MainApp {

    public static void main(String[] args) {
        testConfigurationImport();
    }

    private static void testConfigurationImport() {
        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigB.class);

        A a1 = ctx.getBean(A.class);
        A a2 = ctx.getBean(A.class);
        System.out.println(a1);
        System.out.println(a2);
        B b = ctx.getBean(B.class);

        ctx.registerShutdownHook();
    }

    private static void testConfiguration2() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TextEditorConfig.class);

        TextEditor textEditor = ctx.getBean(TextEditor.class);
        textEditor.spellCheck();
    }

    private static void testConfiguration1() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(HelloWorldConfig.class);

        HelloWorld helloWorld = ctx.getBean(HelloWorld.class);

        helloWorld.setMessage1("Hello USA!");
        helloWorld.getMessage1();
    }

    private static void testQulifier() {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("di/Annotation3.xml");

        Profile profile = context.getBean("profile", Profile.class);

        profile.printAge();
        profile.printName();

        context.registerShutdownHook();
    }

    private static void testAutowiredSetter() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Annotation2.xml");
        Student student = context.getBean("student", Student.class);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Book: " + student.getBook().getName());
    }

    private static void testAnnotationRequired() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Annotation.xml");
        Student student = context.getBean("student", Student.class);

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
    }

    private static void autowiringInXML() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Autowiring.xml");
        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();
    }

    private static void injectCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Collection.xml");

        JavaCollection javaCollection = context.getBean("javaCollection", JavaCollection.class);

        javaCollection.getAddressList();
        javaCollection.getAddressSet();
        javaCollection.getAddressMap();
        javaCollection.getAddressProp();
    }

    private static void testDependencyInjectionConstructorBased1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Beans.xml");
    }

    private static void testDependencyInjectionConstructorBased2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Beans2.xml");

        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();
    }

    private static void testDependencyInjectionConstructorBased3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Beans3.xml");

        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();
    }

    private static void testDependencyInjectionConstructorBased4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("di/Beans4.xml");

        TextEditor textEditor = context.getBean("textEditor", TextEditor.class);
        textEditor.spellCheck();
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
