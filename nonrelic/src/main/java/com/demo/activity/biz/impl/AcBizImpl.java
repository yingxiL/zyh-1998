package com.demo.activity.biz.impl;

import com.demo.activity.entity.Activity;
import com.demo.activity.mapper.AcMapper;
import com.demo.project.entity.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("acBiz")
public class AcBizImpl implements AcBiz {
    @Autowired
    private AcMapper acMapper;
    @Override
    public List<Activity> select() {
        return acMapper.select();
    }

    @Override
    public List<Activity> select1(int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int num=(pageNo-1)*pageSize;
        map.put("pageNo",num);
        map.put("pageSize",pageSize);
        List<Activity> list=acMapper.select1(map);
        return list;
    }

    @Override
    public List<Activity> findById(int id) {
        return acMapper.findById(id);
    }

    @Override
    public boolean add(Activity activity) {
        return acMapper.add(activity);
    }

    @Override
    public boolean update(Activity activity) {
        return acMapper.update(activity);
    }

    @Override
    public boolean delete(int id) {
        return acMapper.delete(id);
    }
}
