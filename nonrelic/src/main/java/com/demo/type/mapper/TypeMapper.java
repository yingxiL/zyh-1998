package com.demo.type.mapper;

import com.demo.type.entity.Type;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface TypeMapper {
    public List<Type> select(Map<String,Object> map);
    public boolean add(Type type);
    public List<Type> findById(int id);
    public boolean update(Type type);
    public boolean del(int id);
}
