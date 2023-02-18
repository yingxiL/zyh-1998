package com.demo.project.biz.impl;

import com.demo.figure.entity.Figure;
import com.demo.project.biz.ProjectBiz;
import com.demo.project.entity.Project;
import com.demo.project.mapper.ProjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("projectBiz")
public class ProjectBizImpl implements ProjectBiz {
    @Autowired
    private ProjectMapper projectMapper;
    @Override
    public Project select(String p_name) {
        return projectMapper.select(p_name);
    }

    @Override
    public List<Project> select1(int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int num=(pageNo-1)*pageSize;
        map.put("pageNo",num);
        map.put("pageSize",pageSize);
        List<Project> list=projectMapper.select1(map);
        return list;
    }

    @Override
    public List<Project> findById(int p_id) {
        return projectMapper.findById(p_id);
    }

    @Override
    public boolean add(Project project) {
        boolean bl=projectMapper.add(project);
        return bl;
    }

    @Override
    public boolean update(Project project) {
        return projectMapper.update(project);
    }

    @Override
    public boolean delete(int p_id) {
        return projectMapper.delete(p_id);
    }
}
