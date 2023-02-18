package com.demo.tourist.mapper;

import com.demo.tourist.entity.Tourist;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;
import java.util.Map;

@Mapper
public interface TouristMapper {
    public List<Tourist> select();
    public List<Tourist> select1(Map<String,Object> map);
    public boolean add(Tourist tourist);
    public List<Tourist> findById(int t_id);
    public boolean update(Tourist tourist);
    public boolean delete(int t_id);

}
