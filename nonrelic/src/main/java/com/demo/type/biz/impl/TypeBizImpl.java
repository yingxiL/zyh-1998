package com.demo.type.biz.impl;

import com.demo.type.entity.Type;
import com.demo.type.mapper.TypeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("typeBiz")
public class TypeBizImpl implements TypeBiz {
    @Autowired
    private TypeMapper typeMapper;

    @Override
    public List<Type> select(int pageNo, int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int num= (pageNo-1)*pageSize;
        map.put("pageNo",num);
        map.put("pageSize",pageSize);
        List<Type> list=typeMapper.select(map);
        return list;
    }

    @Override
    public boolean add(Type type) {
        boolean bl= typeMapper.add(type);
        return bl;
    }

    @Override
    public List<Type> findById(int id) {
        List<Type> list=typeMapper.findById(id);
        return list;
    }

    @Override
    public boolean update(Type type) {
        boolean bl= typeMapper.update(type);
        return bl;
    }

    @Override
    public boolean del(int id) {
        boolean bl= typeMapper.del(id);
        return bl;
    }
}
