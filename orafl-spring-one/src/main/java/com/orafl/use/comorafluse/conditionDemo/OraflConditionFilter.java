package com.orafl.use.comorafluse.conditionDemo;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class OraflConditionFilter implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        if(!conditionContext.getBeanFactory().containsBean("docClass")) {
            return true;
        }
        return false;
    }
}
