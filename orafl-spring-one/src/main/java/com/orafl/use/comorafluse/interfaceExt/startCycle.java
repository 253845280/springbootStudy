package com.orafl.use.comorafluse.interfaceExt;

import org.springframework.context.Lifecycle;
import org.springframework.context.LifecycleProcessor;
import org.springframework.context.SmartLifecycle;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class startCycle implements SmartLifecycle {


    @Override
    public void start() {
        System.out.println("启动调用类");

    }

    @Override
    public void stop() {
        System.out.println("关闭调用类");
        
    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
