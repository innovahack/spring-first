package com.jpm.configuration;

import com.jpm.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    Parrot parrot(){
        var parrot = new Parrot();
        parrot.setName("First Parrot");
        return parrot;
    }
}
