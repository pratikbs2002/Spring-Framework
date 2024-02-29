package com.example.stereotype;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cricket {
    @Value("141")
    public int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void getMessage() {
        System.out.println("I want to play a cricket...");
    }
}
