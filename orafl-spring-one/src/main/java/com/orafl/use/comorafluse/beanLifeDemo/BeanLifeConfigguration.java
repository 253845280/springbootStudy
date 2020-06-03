package com.orafl.use.comorafluse.beanLifeDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanLifeConfigguration {

    //@Bean
    //@Scope("prototype")
    //@Bean(name = "diao")
    @Bean(initMethod ="xxxa" ,destroyMethod="a123")
    public PersonLife personLifexxx(){
        return new PersonLife();
    }
}
