package com.naren.justSpring1;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the bean by its ID and type.
        MyService service = context.getBean("myService", MyService.class);
        service.run();
    }
}
