package com.example.main;

import com.example.config.HelloWorld;
import com.example.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        System.out.println("Demonstrating XML Configuration");
        ApplicationContext xmlContext = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloWorld xmlHelloWorld = (HelloWorld) xmlContext.getBean("xmlBean");
        xmlHelloWorld.getMessage();


        ApplicationContext javaContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        HelloWorld javaHelloWorld = (HelloWorld) javaContext.getBean("javaConfigBean");
        javaHelloWorld.getMessage();


        System.out.println("Demonstrating Annotation-based Configuration");
        HelloWorld annotatedHelloWorld = (HelloWorld) xmlContext.getBean("annotatedBean");
        annotatedHelloWorld.setMessage("Hello from Annotation Configuration!");
        annotatedHelloWorld.getMessage();

    }
}
