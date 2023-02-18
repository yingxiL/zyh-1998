package com.demo.kind.biz.impl;

import com.demo.kind.entity.Kind;
import com.demo.kind.mapper.KindMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("kindBiz")
public class KindBizImpl implements KindBiz {
    @Autowired
    private KindMapper kindMapper;
    @Override
    public List<Kind> select() {
        return kindMapper.select();
    }
}
