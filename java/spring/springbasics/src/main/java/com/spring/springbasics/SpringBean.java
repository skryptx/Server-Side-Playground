package com.spring.springbasics;

import jakarta.inject.Inject;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class SpringBean {
    @Bean
    public String getName() {
        return "Sinni";
    }
}
