package com.example.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Home {
    public static void main(String[] args) {
        // IOC Container
        // Configuration

        // There are 2 types of IoC containers:
        // 1. BeanFactory
        // 2. ApplicationContext

        // BeanFactory interface extends ApplicationContext interface

        // Bean Configuration :
        // 1. Class-Based Annotation Configuration
        // 2. XML-Based Configuration

        // before
        // Role role = new FrontEndDeveloper();
        // Role role = new BackEndDeveloper();
        // System.out.println(role.getMessage());

        // after
        // Xml based configuration.........
        ApplicationContext context = new ClassPathXmlApplicationContext("beans_config.xml");
        Role role = (Role) context.getBean("role");
        System.out.println(role.getMessage());

        // using class based configuration...........
        ApplicationContext context2 = new AnnotationConfigApplicationContext(RoleImplementation.class);
        Role role2 = (Role) context2.getBean("role", Role.class);
        System.out.println(role2.getMessage());

    }
}
