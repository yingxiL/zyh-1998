package com.demo.nonrelic.controller;

import com.demo.nonrelic.biz.impl.NonrelicBiz;
import com.demo.nonrelic.entity.Nonrelic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("nonrelic")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class NonController {
    @Autowired
    private NonrelicBiz nonrelicBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        System.out.println("欢迎！****这是主界面！");
        List<Nonrelic> list=nonrelicBiz.select();
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        return map;
    }
}
