package com.example.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext(
                "com/example/stereotype/bean_configuration.xml");
        System.out.println(context);
        Cricket cricket = (Cricket) context.getBean("cricket");
        System.out.println("\n\nUsing Cricket Object: ");
        cricket.getMessage();
        System.out.println(cricket.getId());
        // Cricket cricket = new Cricket();
        // cricket.getMessage();
        Sport sport = (Sport) context.getBean("sport", Sport.class);
        System.out.println("\n\nUsing Sport Object: ");
        sport.getMessage();
        System.out.println(sport.getCricket().getId());

        // Sport sport = new Sport();
        // sport.setCricket(cricket);
        // sport.getMessage();

    }
}
