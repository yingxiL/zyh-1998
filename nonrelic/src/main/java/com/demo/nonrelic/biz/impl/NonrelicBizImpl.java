package com.demo.nonrelic.biz.impl;

import com.demo.nonrelic.entity.Nonrelic;
import com.demo.nonrelic.mapper.NonrelicMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("nonrelicBiz")
public class NonrelicBizImpl implements NonrelicBiz {
    @Autowired
    private NonrelicMapper nonrelicMapper;
    @Override
    public List<Nonrelic> select() {
        return nonrelicMapper.select();
    }
}
