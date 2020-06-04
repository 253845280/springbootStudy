package com.orafl.use.comorafluse.applicationListenerEventDemo;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

public class MultcatApplicationEvent extends ApplicationEvent {

    public MultcatApplicationEvent(Object source) {
        super(source);
    }

    public void doSomething(){
        System.out.println("do something !");
    }
}
