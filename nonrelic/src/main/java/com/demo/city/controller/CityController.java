package com.demo.city.controller;

import com.demo.city.biz.impl.CityBiz;
import com.demo.city.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("city")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class CityController {
    @Autowired
    private CityBiz cityBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        System.out.println("欢迎！***这是江西省地图的非遗数量！");
        Map<String,Object> map=new HashMap<>();
        List<City> list=cityBiz.select();
        map.put("list",list);
        return map;
    }
}
