package com.demo.figure.mapper;

import com.demo.figure.entity.Figure;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface FiMapper {
    public List<Figure> select(Map<String,Object> map);
    public boolean add(Figure figure);
    public List<Figure> findById(int f_id);
    public boolean update(Figure figure);
    public boolean delete(int f_id);
}
