package com.demo.nonrelic.mapper;

import com.demo.nonrelic.entity.Nonrelic;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NonrelicMapper {
    public List<Nonrelic> select();
}
