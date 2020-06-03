package com.orafl.use.comorafluse.autowiredDemo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.orafl.use.comorafluse.autowiredDemo")
public class autoConfig {

    @Bean
    public PersonWHX wanghongxuan(){
        return new PersonWHX().setName("王红轩");
    }

    @Bean
    public PersonWHX wanghong(){
        return new PersonWHX().setName("网红轩");
    }

    @Bean(name = "a1112233")
    public PersonWHX wanghongxuan1(){
        return new PersonWHX().setName("王红轩1111222");
    }

}
