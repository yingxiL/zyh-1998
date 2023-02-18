package com.demo.type.biz.impl;

import com.demo.type.entity.Type;

import java.util.List;

public interface TypeBiz {
    public List<Type> select(int pageNo,int pageSize);
    public boolean add(Type type);
    public List<Type> findById(int id);
    public boolean update(Type type);
    public boolean del(int id);
}
