package com.lwu.spring.helloworld;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by Leon on 5/29/16.
 */
public class HelloWorld implements InitializingBean, DisposableBean{

    private String message1;
    private String message2;

    public void setMessage1(String message){
        this.message1  = message;
    }

    public void setMessage2(String message){
        this.message2  = message;
    }

    public void getMessage1(){
        System.out.println("World Message1 : " + message1);
    }

    public void getMessage2(){
        System.out.println("World Message2 : " + message2);
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
