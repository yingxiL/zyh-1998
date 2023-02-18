package com.demo.city.mapper;

import com.demo.city.entity.City;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CityMapper {
    public List<City> select();
}
