package com.devbytes.springboot.learn.devbytesdemo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${spring.application.name}")
    String appName;

    @GetMapping("/")
    public String sayHello() {
        return String.format("Hello World from %s!", this.appName);
    }

    @GetMapping("/weather")
    public String getWeather() {
        return "Summer 30 degree";
    }
}
