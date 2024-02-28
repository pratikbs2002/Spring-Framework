package com.example.wired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Sport {

    private Cricket cricket;

    public Cricket getCricket() {
        return cricket;
    }

    // public Sport(Cricket cricket) {
    // System.out.println("---> Constructor of sport class for cricket");
    // this.cricket = cricket;
    // }
    @Autowired
    @Qualifier("cricket2")
    public void setCricket(Cricket cricket) {
        System.out.println("---> Setter method of sport class for cricket");
        this.cricket = cricket;
    }

    public void getMessage() {
        cricket.getMessage();
    }

}
