package com.demo.drawer.controller;

import com.demo.drawer.biz.impl.DrawerBiz;
import com.demo.drawer.entity.Drawer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("drawer")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class DrawerController {
    @Autowired
    private DrawerBiz drawerBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        Map<String,Object> map=new HashMap<>();
        List<Drawer> list=drawerBiz.select();
        map.put("list",list);
        return map;
    }
}
