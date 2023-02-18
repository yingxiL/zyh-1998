package com.demo.news.controller;

import com.demo.news.biz.NewsBiz;
import com.demo.news.entity.News;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("news")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class NewsController {
    @Autowired
    private NewsBiz newsBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        System.out.println("欢迎！****这是文化简介界面！");
        Map<String,Object> map=new HashMap<>();
        List<News> list=newsBiz.select();
        map.put("list",list);
        return map;
    }
}
