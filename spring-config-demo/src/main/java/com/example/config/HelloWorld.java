package com.example.config;

import org.springframework.stereotype.Component;

@Component("annotatedBean")
public class HelloWorld {
    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println(message);
    }
}
