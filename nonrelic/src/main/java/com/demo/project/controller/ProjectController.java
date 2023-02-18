package com.demo.project.controller;

import com.demo.project.biz.ProjectBiz;
import com.demo.project.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("project")
@CrossOrigin(origins = "http://localhost:8080",maxAge = 3600)
public class ProjectController {
    @Autowired
    private ProjectBiz projectBiz;
    @RequestMapping("/select")
    public Project select(String p_name){
        System.out.println("项目名："+p_name);
        Project project= projectBiz.select(p_name);
        return project;
    }
    @RequestMapping("/select1")
    public Map<String, Object> select1(Integer pageNo){
        if (pageNo == null){
            pageNo=1;
        }
        int pageSize=1;
        List<Project> list= projectBiz.select1(pageNo,pageSize);
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("list",list);
        map.put("pageNo",pageNo);
        return map;
    }
    @RequestMapping("/add")
    public boolean add(String p_name,String p_profile){
        Project project=new Project(p_name,p_profile);
        boolean bl=projectBiz.add(project);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/findById")
    public List<Project> findById(int p_id){
        List<Project> list=projectBiz.findById(p_id);
        return list;
    }
    @RequestMapping("/update")
    public boolean update(Project project){
        boolean bl=projectBiz.update(project);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
    @RequestMapping("/delete")
    public boolean delete(int p_id){
        boolean bl= projectBiz.delete(p_id);
        if (bl==true){
            return true;
        }else {
            return false;
        }
    }
}
