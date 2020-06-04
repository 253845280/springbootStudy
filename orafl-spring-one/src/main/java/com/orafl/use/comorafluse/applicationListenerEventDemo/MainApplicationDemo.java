package com.orafl.use.comorafluse.applicationListenerEventDemo;

import com.orafl.use.comorafluse.ComOraflUseApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Set;

@SpringBootApplication
public class MainApplicationDemo {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MainApplicationDemo.class);
        //需要把监听器加入到spring容器中
        application.addListeners(new ApplicationListener());
        Set<org.springframework.context.ApplicationListener<?>> listeners = application.getListeners();
        ConfigurableApplicationContext context =  application.run(args);
        //发布事件
        context.publishEvent(new MultcatApplicationEvent("123"));

        context.close();
    }
}
