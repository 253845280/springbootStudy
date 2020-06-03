package com.orafl.use.comorafluse.beanLifeDemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanLifeMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(BeanLifeConfigguration.class);
        Object ob = anno.getBeanFactory().getBean("personLifexxx");
        System.out.println(ob);
        anno.close();
    }
}
