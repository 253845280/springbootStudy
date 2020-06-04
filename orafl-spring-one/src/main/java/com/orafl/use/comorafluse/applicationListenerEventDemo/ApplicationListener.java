package com.orafl.use.comorafluse.applicationListenerEventDemo;

public class ApplicationListener implements org.springframework.context.ApplicationListener<MultcatApplicationEvent> {

    @Override
    public void onApplicationEvent(MultcatApplicationEvent multcatApplicationEvent) {
        multcatApplicationEvent.doSomething();
    }


}
