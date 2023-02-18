package com.demo.activity.controller;

import com.demo.activity.biz.impl.AcBiz;
import com.demo.activity.entity.Activity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("activity")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class ActivityController {
    @Autowired
    private AcBiz acBiz;
    @RequestMapping("select")
    @ResponseBody
    public Map<String,Object> select(){
        List<Activity> list= acBiz.select();
        Map<String,Object> map= new HashMap<>();
        map.put("list",list);
        System.out.println("activity");
        return map;
    }
    @RequestMapping("/select1")
    public Map<String, Object> select1(Integer pageNo){
        if (pageNo == null){
            pageNo=1;
        }
        int pageSize=1;
        List<Activity> list= acBiz.select1(pageNo,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("pageNo",pageNo);
        return map;
    }
    @RequestMapping("/add")
    public boolean add(String title3,String text1){
        Activity activity=new Activity(title3,text1);
        boolean bl=acBiz.add(activity);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/findById")
    public List<Activity> findById(int id){
        List<Activity> list=acBiz.findById(id);
        return list;
    }
    @RequestMapping("/update")
    public boolean update(Activity activity){
        boolean bl=acBiz.update(activity);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/delete")
    public boolean delete(int id){
        boolean bl= acBiz.delete(id);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
}
