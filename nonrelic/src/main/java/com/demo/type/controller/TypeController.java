package com.demo.type.controller;

import com.demo.type.biz.impl.TypeBiz;
import com.demo.type.entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("type")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class TypeController {
    @Autowired
    private TypeBiz typeBiz;
    @ResponseBody
    @GetMapping("select")
    public Map<String, Object> select(Integer pageNo){
        if (pageNo == null){
            pageNo=1;
        }
        int pageSize=4;
        List<Type> list= typeBiz.select(pageNo,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("pageNo",pageNo);
        return map;
    }
    @RequestMapping("/add")
    public boolean add(int c_id,String c_no,String c_time,String c_unit, String c_name,String c_class,String c_type){
        Type type=new Type(c_id,c_no,c_name,c_class,c_type,c_time,c_unit);
        boolean bl=typeBiz.add(type);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/findById")
    public List<Type> findById(int id){
        List<Type> list=typeBiz.findById(id);
        return list;
    }
    @RequestMapping("update")
    public boolean update(Type type){
        boolean bl=typeBiz.update(type);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("del")
    public boolean del(int id){
        boolean bl=typeBiz.del(id);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
}
