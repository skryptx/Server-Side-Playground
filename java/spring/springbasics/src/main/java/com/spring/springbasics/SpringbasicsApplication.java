package com.spring.springbasics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class SpringbasicsApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(SpringBean.class);
//		System.out.println(context.getBean("person"));
//		System.out.println(context.getBean("person2"));
//		System.out.println(context.getBean("person3"));
		System.out.println(context.getBean("getPersonInfo"));
	}

}
