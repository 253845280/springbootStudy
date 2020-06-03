package com.orafl.use.comorafluse.componmentScanDemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanMain {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext anno = new AnnotationConfigApplicationContext(ScanTest.class);
        anno.getBeanFactory().getBeanNamesIterator().forEachRemaining(p->{
            System.out.println(p);
        });
    }
}
