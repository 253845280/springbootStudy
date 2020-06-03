package com.orafl.use.comorafluse.propertiesDemo;

import java.util.List;

public class Leader {
    private String name ;
    private String position;
    private List<String> subordinate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public List<String> getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(List<String> subordinate) {
        this.subordinate = subordinate;
    }
}
