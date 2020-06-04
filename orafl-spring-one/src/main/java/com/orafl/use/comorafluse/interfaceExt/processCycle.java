package com.orafl.use.comorafluse.interfaceExt;

import org.springframework.context.LifecycleProcessor;
import org.springframework.stereotype.Component;

/*@Component*/
public class processCycle implements LifecycleProcessor {
    boolean isAutoStartup() {
        return true;
    }

    @Override
    public void onRefresh() {
        System.out.println("LifecycleProcessor onRefresh");
    }

    @Override
    public void onClose() {
        System.out.println("LifecycleProcessor onClose");
    }

    @Override
    public void start() {
        System.out.println("LifecycleProcessor start");
    }

    @Override
    public void stop() {

    }

    @Override
    public boolean isRunning() {
        return false;
    }
}
