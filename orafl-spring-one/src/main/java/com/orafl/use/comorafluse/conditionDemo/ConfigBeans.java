package com.orafl.use.comorafluse.conditionDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigBeans {
    @Conditional(value = OraflConditionFilter.class)
    @Bean
    public DocClass xxDocClass(){
        return new DocClass();
    }
}
