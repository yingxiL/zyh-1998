package com.demo.city.biz.impl;

import com.demo.city.entity.City;
import com.demo.city.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("cityBiz")
public class CityBizImpl implements CityBiz {
    @Autowired
    private CityMapper cityMapper;
    @Override
    public List<City> select() {
        return cityMapper.select();
    }
}
