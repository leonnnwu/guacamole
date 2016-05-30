package com.lwu.spring.denpendency.injection.configuation;

/**
 * Created by Leon on 5/29/16.
 */
public class A {

    public void init() {
        System.out.println("Inside A init");
    }
    public void cleanup() {
        System.out.println("Inside A destroy");
    }

}
