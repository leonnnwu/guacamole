package com.lwu.spring.denpendency.injection.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Leon on 5/29/16.
 */
public class Profile {
    @Autowired
    @Qualifier("student2")
    private Student student;

    public Profile(){
        System.out.println("Inside Profile constructor." );
    }

    public void printAge() {
        System.out.println("Age : " + student.getAge() );
    }

    public void printName() {
        System.out.println("Name : " + student.getName() );
    }

    @PostConstruct
    public void init() {
        System.out.println("Bean is going through init.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Bean will destroy now.");
    }
}
