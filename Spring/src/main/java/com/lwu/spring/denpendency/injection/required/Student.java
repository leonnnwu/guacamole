package com.lwu.spring.denpendency.injection.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Leon on 5/29/16.
 */
public class Student {
    private Integer age;
    private String name;
    private Book book;

    @Required
    public void setAge(Integer age) {
        this.age = age;
    }
    public Integer getAge() {
        return age;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Autowired
    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return this.book;
    }
}
