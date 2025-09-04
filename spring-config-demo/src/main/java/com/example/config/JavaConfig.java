package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean("javaConfigBean")
    public HelloWorld getHelloWorldBean() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello from Java Configuration!");
        return helloWorld;
    }
}
