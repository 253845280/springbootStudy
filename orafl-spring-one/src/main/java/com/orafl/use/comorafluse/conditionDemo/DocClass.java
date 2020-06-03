package com.orafl.use.comorafluse.conditionDemo;

import org.springframework.stereotype.Component;

/*@Component*/
public class DocClass {

    private String docName ="test";

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }
}
