package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans_config.xml");
        Employee new1 = (Employee) applicationContext.getBean("emp1");
        System.out.println(new1);

    }
}
