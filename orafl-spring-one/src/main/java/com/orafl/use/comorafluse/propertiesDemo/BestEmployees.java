package com.orafl.use.comorafluse.propertiesDemo;

import java.util.Map;

public class BestEmployees {
    private String name;
    private String sex;
    private Map<String,String> skills;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Map<String, String> getSkills() {
        return skills;
    }

    public void setSkills(Map<String, String> skills) {
        this.skills = skills;
    }
}
