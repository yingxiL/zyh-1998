package com.demo.knowledge.mapper;

import com.demo.knowledge.entity.Knowledge;
import com.demo.tourist.entity.Tourist;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface KnMapper {
    public List<Knowledge> select();
    public List<Knowledge> select1(Map<String,Object> map);
    public boolean add(Knowledge knowledge);
    public List<Knowledge> findById(int k_id);
    public boolean update(Knowledge knowledge);
    public boolean delete(int k_id);
}
