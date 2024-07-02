package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // Explore Spring Framework Configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien", Alien.class);
//        obj.code();
//        System.out.println(obj.getAge());

        // Working with Java Based Configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean("alien", Alien.class);
        obj.code();
        System.out.println(obj.getAge());


//        Desktop dt = context.getBean("desktop",Desktop.class);
//        dt.compiler();
//
//        Desktop dt1 = context.getBean("desktop",Desktop.class);
//        dt1.compiler();


    }
}
