package com.orafl.use.comorafluse.componmentScanDemo.anno;


import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface OraflAnno {
}
