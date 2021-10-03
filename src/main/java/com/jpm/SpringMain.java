package com.jpm;


import com.jpm.configuration.ProjectConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringMain {
private static final Logger log = LoggerFactory.getLogger(SpringMain.class);

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot parrot = context.getBean("parrot2",Parrot.class);
        log.info(parrot.getName());

        String greet = context.getBean(String.class);
        log.info(greet);

        Integer number = context.getBean(Integer.class);
        log.info(String.valueOf(number));
    }
}
