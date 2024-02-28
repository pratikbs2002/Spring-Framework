package com.example.standaloneList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/standaloneList/bean_configuration.xml");

        Cricket cricket = (Cricket) context.getBean("cricket");
        System.out.println(cricket);
    }
}
