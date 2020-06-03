package com.orafl.use.comorafluse.autowiredDemo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationTest {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(autoConfig.class);
        Object oo = anno.getBeanFactory().getBean("xxxBizService");
        //Object o1 = anno.getBeanFactory().getBean("wanghongxuan");

        System.out.println(oo);
    }
}
