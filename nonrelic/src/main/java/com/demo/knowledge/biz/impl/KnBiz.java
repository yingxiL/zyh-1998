package com.demo.knowledge.biz.impl;

import com.demo.knowledge.entity.Knowledge;

import java.util.List;
import java.util.Map;

public interface KnBiz {
    public List<Knowledge> select();
    public List<Knowledge> select1(int pageNo,int pageSize);
    public boolean add(Knowledge knowledge);
    public List<Knowledge> findById(int k_id);
    public boolean update(Knowledge knowledge);
    public boolean delete(int k_id);
}
