package com.orafl.use.comorafluse.propertiesDemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties(prefix = "oraflemployee")
public class EmployeesInfo {


    private BestEmployees employees;
    private Leader leader;

    private String companyName;


    public BestEmployees getEmployees() {
        return employees;
    }

    public void setEmployees(BestEmployees employees) {
        this.employees = employees;
    }

    public Leader getLeader() {
        return leader;
    }

    public void setLeader(Leader leader) {
        this.leader = leader;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
