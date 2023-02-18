package com.demo.activity.biz.impl;

import com.demo.activity.entity.Activity;

import java.util.List;
import java.util.Map;

public interface AcBiz {
    public List<Activity> select();
    public List<Activity> select1(int pageNo,int pageSize);
    public List<Activity> findById(int id);
    public boolean add(Activity activity);
    public boolean update(Activity activity);
    public boolean delete(int id);
}
