package com.jpm;


import com.jpm.configuration.ProjectConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ParrotMain {
private static final Logger log = LoggerFactory.getLogger(ParrotMain.class);

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot parrot = context.getBean(Parrot.class);
        log.info(parrot.getName());
    }
}
