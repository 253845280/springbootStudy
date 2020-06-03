package com.orafl.use.comorafluse.controller;

import com.alibaba.fastjson.JSONObject;
import com.orafl.use.comorafluse.conditionDemo.DocClass;
import com.orafl.use.comorafluse.propertiesDemo.EmployeesInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class propertiesTest {
    @Autowired
    private EmployeesInfo employees;

    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @RequestMapping("/getEmployeeInfo")
    public EmployeesInfo getEmployeeInfo() {
        return employees;
    }

    @RequestMapping("/checnkRegisterClass")
    public String checnkRegisterClass(){
        DocClass dclass = applicationContext.getBean(DocClass.class);
        return JSONObject.toJSONString(dclass);
    }
}
