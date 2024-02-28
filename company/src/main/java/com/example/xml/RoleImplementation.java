package com.example.xml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoleImplementation {

    @Bean
    public Role role() {
        // return new FrontEndDeveloper();
        return new BackEndDeveloper();
    }
}
