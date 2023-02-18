package com.demo.admin.controller;

import com.demo.admin.biz.AdminBiz;
import com.demo.admin.entity.Sadmin;
import com.demo.admin.entity.Vadmin;
import com.demo.tourist.entity.Tourist;
import org.apache.ibatis.annotations.Param;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("admin")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class AdminController {
    @Autowired
    private AdminBiz adminBiz;
    @RequestMapping("/login1")
    public List<Sadmin> login1(String s_account, String s_pwd) {
        System.out.println("s_account="+s_account+" "+"s_pwd="+s_pwd);
        List<Sadmin> list=adminBiz.login1(s_account, s_pwd);
        return list;
    }
    @RequestMapping("/login2")
    public List<Vadmin> login2(String v_account, String v_pwd) {
        List<Vadmin> list1=adminBiz.login2(v_account, v_pwd);
        return list1;
    }
    @GetMapping("select")
    @ResponseBody
    public Map<String,Object> select(Integer pageNo){
        if (pageNo == null){
            pageNo=1;
        }
        int pageSize=5;
        int num=(pageNo-1) *pageSize;
        List<Vadmin> list= adminBiz.select(num,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        map.put("list",list);
        return map;
    }
    @GetMapping("select1")
    @ResponseBody
    public Map<String,Object> select1(Integer pageNo){
        if (pageNo == null){
            pageNo=1;
        }
        int pageSize=5;
        int num=(pageNo-1) *pageSize;
        List<Sadmin> list= adminBiz.select1(num,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("pageNo",pageNo);
        map.put("pageSize",pageSize);
        map.put("list",list);
        return map;
    }
    @GetMapping("/add1")
    @ResponseBody
    public boolean add1(String s_name, String s_account, String s_pwd,String s_mb, String s_adr, String s_phone, String s_card){
        Sadmin sadmin= new Sadmin(s_name,s_account,s_pwd,s_mb,s_adr,s_phone,s_card);
        boolean bl= adminBiz.add1(sadmin);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/add2")
    public boolean add2(String v_name,String v_account,String v_pwd,String v_mb,String v_adr,String v_phone,String v_card,String v_role){
        Vadmin vadmin=new Vadmin(v_name,v_account,v_pwd,v_mb,v_adr,v_phone,v_card,v_role);
        boolean bl= adminBiz.add2(vadmin);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/findById1")
    public List<Sadmin> findById1(int s_id){
        List<Sadmin> list=adminBiz.findById1(s_id);
        return list;
    }
    @RequestMapping("/findById2")
    public List<Vadmin> findById2(int v_id){
        List<Vadmin> list=adminBiz.findById2(v_id);
        return list;
    }
    @RequestMapping("update1")
    public boolean update1(Sadmin sadmin){
        boolean bl=adminBiz.update1(sadmin);
        return bl;
    }
    @RequestMapping("update2")
    public boolean update2(Vadmin vadmin){
        boolean bl=adminBiz.update2(vadmin);
        return bl;
    }
    @RequestMapping("delete1")
    public boolean delete1(int s_id){
        boolean bl=adminBiz.delete1(s_id);
        return bl;
    }
    @RequestMapping("delete2")
    public boolean delete2(int v_id){
        boolean bl=adminBiz.delete2(v_id);
        return bl;
    }
}
