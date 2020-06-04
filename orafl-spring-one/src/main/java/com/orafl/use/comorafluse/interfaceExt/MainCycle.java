package com.orafl.use.comorafluse.interfaceExt;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainCycle {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ann = new AnnotationConfigApplicationContext(Config.class);
        //ann.getBeanFactory().getBean("startCycle");
        //ann.start();
        //ann.close();
    }
}
