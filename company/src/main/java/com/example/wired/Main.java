package com.example.wired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.sport.Student;
import com.example.sport.Teacher;

public class Main {
    public static void main(String[] args) {
        // When we are using autowired annotation for the auto object assigning ...
        // working behind of @Autowired
        // try to resolve with "byType" then "byName"

        // -->No need to write setter if we are using @Autowired before the
        // dependency...

        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/wired/bean_configuration.xml");
        Sport sport = (Sport) context.getBean("sport");
        sport.getMessage();
    }
}
