package com.demo.knowledge.biz.impl;

import com.demo.img.biz.impl.ImgBiz;
import com.demo.img.entity.Img;
import com.demo.img.mapper.ImgMapper;
import com.demo.knowledge.entity.Knowledge;
import com.demo.knowledge.mapper.KnMapper;
import com.demo.tourist.entity.Tourist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("knBiz")
public class KnBizImpl implements KnBiz {
    @Autowired
    private KnMapper knMapper;
    @Override
    public List<Knowledge> select() {
        return knMapper.select();
    }

    @Override
    public List<Knowledge> select1(int pageNo, int pageSize) {
        Map<String,Object> map= new HashMap<String, Object>();
        int num=(pageNo-1) *pageSize;
        map.put("pageNo",num);
        map.put("pageSize",pageSize);
        List<Knowledge> List=knMapper.select1(map);
        return List;
    }

    @Override
    public boolean add(Knowledge knowledge) {
        return knMapper.add(knowledge);
    }

    @Override
    public List<Knowledge> findById(int k_id) {
        return knMapper.findById(k_id);
    }

    @Override
    public boolean update(Knowledge knowledge) {
        return knMapper.update(knowledge);
    }

    @Override
    public boolean delete(int k_id) {
        return knMapper.delete(k_id);
    }
}
