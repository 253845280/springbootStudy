package com.orafl.use.comorafluse.autowiredDemo;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class xxxBizService {

    @Qualifier("a1112233")
    @Autowired
    private PersonWHX wanghong;

    @Override
    public String toString() {
        return JSONObject.toJSONString(wanghong).toString();
    }
}
