package com.orafl.use.comorafluse.interfaceExt;

import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class startCycle implements LifecycleProcessor {


    @Override
    public void onRefresh() {
        System.out.println("onRefresh");
    }

    @Override
    public void onClose() {
        System.out.println("onClose");
    }

    @Override
    public void start() {
        System.out.println("start");

    }

    @Override
    public void stop() {
        System.out.println("start");

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
