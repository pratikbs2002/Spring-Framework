package com.example.sport;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Cricket implements Sport, InitializingBean, DisposableBean {
    public Cricket() {
        System.out.println("Hey, cricket constructor is here........");
    }

    public String getMessage() {
        return "Hey, i want to play cricket!";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Initializing Cricket bean...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy Cricket bean...");
    }
}
