package com.spring.springbasics;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class Person {
    String name;
    @Inject
    public Person(String name) {
        this.name = name;
        System.out.println(new StringBuffer().append(this));
    }
}
