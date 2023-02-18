package com.demo.kind.controller;

import com.demo.kind.biz.impl.KindBiz;
import com.demo.kind.entity.Kind;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("kind")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class KindController {
    @Autowired
    private KindBiz kindBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        List<Kind> list=kindBiz.select();
        Map<String,Object> map=new HashMap<>();
        map.put("list",list);
        return map;
    }
}
