package com.demo.tourist.biz;

import com.demo.project.entity.Project;
import com.demo.tourist.entity.Tourist;

import java.util.List;
import java.util.Map;

public interface TouristBiz {
    public List<Tourist> select();
    public List<Tourist> select1(int pageNo,int pageSize);
    public List<Tourist> findById(int t_id);
    public boolean add(Tourist tourist);
    public boolean update(Tourist tourist);
    public boolean delete(int t_id);
}
