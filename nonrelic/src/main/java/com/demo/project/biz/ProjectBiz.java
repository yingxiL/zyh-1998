package com.demo.project.biz;

import com.demo.project.entity.Project;

import java.util.List;
import java.util.Map;

public interface ProjectBiz {
    public Project select(String p_name);
    public List<Project> select1(int pageNo,int pageSize);
    public List<Project> findById(int p_id);
    public boolean add(Project project);
    public boolean update(Project project);
    public boolean delete(int p_id);
}
