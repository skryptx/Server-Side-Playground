package com.spring.springbasics;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class SpringBean {
    @Component
    record Person(String name) {}
//
	@Bean
	public String name() {
		return "Sinni";
	}
//
//    @Bean("age1")
//    public int age() {
//        return 31;
//    }

//    @Bean
//    public Person person() {
//        return new Person("Sinni", age());
//    }
//
//    @Bean
//    public Person person2(String name, int age1) {
//        return new Person("Shanky", age1);
//    }
//
//	@Bean
//	public Person person3(int age1) {
//		return new Person("Shanky Singla", age1);
//	}

    @Bean
    public String getPersonInfo(Person person) {
        System.out.println(person.hashCode());
        System.out.println(new StringBuffer().append("Test"));
        return person.toString();
    }
}
