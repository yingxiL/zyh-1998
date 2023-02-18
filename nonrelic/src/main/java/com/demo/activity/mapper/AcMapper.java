package com.demo.activity.mapper;

import com.demo.activity.entity.Activity;
import com.demo.project.entity.Project;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface AcMapper {
    public List<Activity> select();
    public List<Activity> select1(Map<String,Object> map);
    public List<Activity> findById(int id);
    public boolean add(Activity activity);
    public boolean update(Activity activity);
    public boolean delete(int id);
}
