package com.demo.img.controller;

import com.demo.img.biz.impl.ImgBiz;
import com.demo.img.entity.Img;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
/*
    懒图片加载
 */
@RestController
@RequestMapping("img")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class Controller {
    @Autowired
    private ImgBiz imgBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        System.out.println("欢迎！***这是轮播图！");
        Map<String,Object> map=new HashMap<>();
        List<Img> list=imgBiz.select();
        map.put("list",list);
        return map;
    }
    @ResponseBody
    @GetMapping("select1")
    public Map<String,Object> select1(){
        Map<String,Object> map=new HashMap<>();
        List<Img> list=imgBiz.select1();
        map.put("list",list);
        return map;
    }
    @ResponseBody
    @GetMapping("select2")
    public Map<String,Object> select2(){
        Map<String,Object> map=new HashMap<>();
        List<Img> list=imgBiz.select2();
        map.put("list",list);
        return map;
    }
    @ResponseBody
    @GetMapping("select3")
    public Map<String,Object> select3(){
        Map<String,Object> map=new HashMap<>();
        List<Img> list=imgBiz.select3();
        map.put("list",list);
        return map;
    }
}
