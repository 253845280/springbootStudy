package com.orafl.use.comorafluse.componmentScanDemo;


import org.springframework.context.annotation.ComponentScan;

/*@ComponentScan(basePackages = {"com.orafl.use.comorafluse.componmentScanDemo.beans"},includeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = OraflAnno.class)
})*/
/*@ComponentScan(basePackages = {"com.orafl.use.comorafluse.componmentScanDemo.beans"},excludeFilters = {
        @ComponentScan.Filter(type = FilterType.CUSTOM,value = OraflFilterType.class)
})*/
@ComponentScan(basePackages ={"com.orafl.use.comorafluse.componmentScanDemo.beans"} )
public class ScanTest {
}
