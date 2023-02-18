package com.demo.project.mapper;

import com.demo.project.entity.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProjectMapper {
    public Project select(@Param("p_name") String p_name);
    public List<Project> select1(Map<String,Object> map);
    public List<Project> findById(int p_id);
    public boolean add(Project project);
    public boolean update(Project project);
    public boolean delete(int p_id);
}
