package com.naren.firstSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Main application class for Java-based configuration.
 *
 * The @Configuration annotation tells Spring that this class contains bean definitions.
 * It's the Java equivalent of an XML bean definition file.
 */
@Configuration
public class Application {

    /**
     * This method creates and returns a MyService object.
     *
     * The @Bean annotation tells Spring to register the object returned by this method
     * as a bean in the application context. By default, the bean's name is the
     * method name ("myService").
     * @return a new instance of MyService.
     */
    @Bean
    public Alien myService() {
        return new Alien();
    }

    public static void main(String[] args) {
        // Create the application context by loading the AppConfig class.
        // This is where Spring reads the configuration and creates the beans.
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

        // Retrieve the bean from the context.
        Alien service = context.getBean(Alien.class);
        service.code();

       
    }
}
