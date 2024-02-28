package com.example.sport;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        /*
         * There are three types of dependency :
         * 1. in form of literals
         * 2. in form of objective
         * 3. in form of collection
         * 
         * There are two ways to injecting literals:
         * 1. Using Setter injection
         * 2. Using Constructor injection
         */

        ApplicationContext context = new ClassPathXmlApplicationContext("com/example/sport/bean_configuration.xml");
        // Student student = (Student) context.getBean("student", Student.class);
        // Teacher teacher = (Teacher) context.getBean("teacher", Teacher.class);

        // System.out.println(student.getId() + " : " + student.getName() + " : " +
        // student.getCricket().getMessage());
        // System.out.println(teacher.getId() + " : " + teacher.getName() + " : " +
        // teacher.getCricket().getMessage());

        Student student = context.getBean("student", Student.class);
        Teacher teacher = context.getBean("teacher", Teacher.class);
        System.out.println(student.getSport().getMessage());
        System.out.println(teacher.getSport().getMessage());
        System.out.println(student);
        System.out.println(teacher);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
