package com.demo.volunteer.controller;

import com.demo.volunteer.biz.impl.VoBiz;
import com.demo.volunteer.entity.Volunteer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("volunteer")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class VoController {
    @Autowired
    private VoBiz voBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        System.out.println("欢迎！********这是志愿者界面！");
        List<Volunteer> list=voBiz.select();
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        return map;
    }
}
