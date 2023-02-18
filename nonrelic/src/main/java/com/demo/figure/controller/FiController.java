package com.demo.figure.controller;

import com.demo.figure.biz.impl.FigureBiz;
import com.demo.figure.entity.Figure;
import com.demo.knowledge.biz.impl.KnBiz;
import com.demo.knowledge.entity.Knowledge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("figure")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class FiController {
    @Autowired
    private FigureBiz figureBiz;
    @RequestMapping("/add")
    public boolean add(String n_name,String n_type,String f_name,String f_age,String f_text,String adr){
        Figure figure =new Figure(n_name,n_type,f_name,f_age,f_text,adr);
        boolean bl=figureBiz.add(figure);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/select")
    public Map<String, Object> select1(Integer pageNo){
        if (pageNo == null){
            pageNo=1;
        }
        int pageSize=4;
        List<Figure> list= figureBiz.select(pageNo,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("pageNo",pageNo);
        return map;
    }
    @RequestMapping("/findById")
    public List<Figure> findById(int f_id){
        List<Figure> list=figureBiz.findById(f_id);
        return list;
    }
    @RequestMapping("/update")
    public boolean update(Figure figure){
        boolean bl=figureBiz.update(figure);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/delete")
    public boolean delete(int f_id){
        boolean bl= figureBiz.delete(f_id);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
}
