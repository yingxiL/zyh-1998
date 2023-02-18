package com.demo.knowledge.controller;

import com.demo.knowledge.biz.impl.KnBiz;
import com.demo.knowledge.entity.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("knowledge")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class KnController {
    @Autowired
    private KnBiz knBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String,Object> select(){
        System.out.println("欢迎！***这是知识窗！");
        Map<String,Object> map=new HashMap<>();
        List<Knowledge> list=knBiz.select();
        map.put("list",list);
        return map;
    }
    @RequestMapping("/add")
    public boolean add(String id,String name,String name1,String text,String text1){
        Knowledge knowledge=new Knowledge(id,name,name1,text,text1);
        boolean bl=knBiz.add(knowledge);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/select1")
    public Map<String, Object> select1(Integer pageNo){
        if (pageNo == null){
            pageNo=1;
        }
        int pageSize=1;
        List<Knowledge> list= knBiz.select1(pageNo,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("pageNo",pageNo);
        return map;
    }
    @RequestMapping("/findById")
    public List<Knowledge> findById(int k_id){
        List<Knowledge> list=knBiz.findById(k_id);
        return list;
    }
    @RequestMapping("/update")
    public boolean update(Knowledge knowledge){
        boolean bl=knBiz.update(knowledge);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/delete")
    public boolean delete(int k_id){
        boolean bl= knBiz.delete(k_id);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
}
