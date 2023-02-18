package com.demo.tourist.controller;

import com.demo.tourist.biz.TouristBiz;
import com.demo.tourist.entity.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("tourist")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class TouristController {
    @Autowired
    private TouristBiz touristBiz;
    @RequestMapping("/add")
    public boolean add(String t_name,int t_age,String t_mb,String t_phone,String t_card,String t_adr){
        Tourist tourist=new Tourist(t_name,t_age,t_mb,t_phone,t_card,t_adr);
        boolean bl=touristBiz.add(tourist);
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
        int pageSize=5;
        List<Tourist> list= touristBiz.select1(pageNo,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("pageNo",pageNo);
        return map;
    }
    @RequestMapping("/select")
    public List<Tourist> select(){
        System.out.println("欢迎！*****这是游客界面！");
        List<Tourist> list=touristBiz.select();
        return list;
    }
    @RequestMapping("/findById")
    public List<Tourist> findById(int t_id){
        System.out.println(t_id);
        List<Tourist> list=touristBiz.findById(t_id);
        return list;
    }
    @RequestMapping("/update")
    public boolean update(int t_id,String t_name,int t_age,String t_mb,String t_phone,String t_card,String t_adr){
        System.out.println(t_name+"   111");
        Tourist tourist= new Tourist(t_id,t_name,t_age,t_mb,t_phone,t_card,t_adr);
        boolean bl=touristBiz.update(tourist);
        System.out.println();
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/delete")
    public boolean delete(int t_id){
        boolean bl= touristBiz.delete(t_id);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
}
