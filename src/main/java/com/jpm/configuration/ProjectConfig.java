package com.jpm.configuration;

import com.jpm.Hello;
import com.jpm.MyNumber;
import com.jpm.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean(name="parrot1")
    Parrot parrot1(){
        var parrot = new Parrot();
        parrot.setName("First Parrot");
        return parrot;
    }

    @Bean(name="parrot2")
    Parrot parrot(){
        var parrot = new Parrot();
        parrot.setName("Second Parrot");
        return parrot;
    }

    @Bean(name="3rd-parrot")
    Parrot parrot3(){
        var parrot = new Parrot();
        parrot.setName("Third Parrot");
        return parrot;
    }


    @Bean
    String hello(){
        var greet = new Hello();
        greet.setGreet("Hello Spring");
        return greet.getGreet();
    }

    @Bean
    Integer myNumber(){
        var num = new MyNumber();
        num.setTestNumber(104);
        return num.getTestNumber();
    }
}
