package com.demo.tourist.biz.impl;

import com.demo.tourist.biz.TouristBiz;
import com.demo.tourist.entity.Tourist;
import com.demo.tourist.mapper.TouristMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("touristBiz")
public class TouristBizImpl implements TouristBiz {
    @Autowired
    private TouristMapper touristMapper;
    @Override
    public List<Tourist> select() {
        return touristMapper.select();
    }

    @Override
    public List<Tourist> select1(int pageNo, int pageSize) {
        Map<String,Object> map= new HashMap<String, Object>();
        int num=(pageNo-1) *pageSize;
        map.put("pageNo",num);
        map.put("pageSize",pageSize);
        List<Tourist> touristList=touristMapper.select1(map);
        return touristList;
    }

    @Override
    public List<Tourist> findById(int t_id) {
        return touristMapper.findById(t_id);
    }

    @Override
    public boolean add(Tourist tourist) {
        return touristMapper.add(tourist);
    }

    @Override
    public boolean update(Tourist tourist) {
        return touristMapper.update(tourist);
    }

    @Override
    public boolean delete(int t_id) {
        return touristMapper.delete(t_id);
    }
}
