package com.example.stereotype;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Sport {

    @Autowired
    private Cricket cricket;

    public Cricket getCricket() {
        return cricket;
    }

    public void setCricket(Cricket cricket) {
        System.out.println("---> Setter method of sport class for cricket");
        this.cricket = cricket;
    }

    public void getMessage() {
        cricket.getMessage();
    }

}
