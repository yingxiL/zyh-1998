package com.demo.figure.biz.impl;

import com.demo.figure.entity.Figure;
import com.demo.figure.mapper.FiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("figureBiz")
public class FiBizImpl implements FigureBiz {
    @Autowired
    private FiMapper fiMapper;
    @Override
    public List<Figure> select(int pageNo,int pageSize) {
        Map<String,Object> map=new HashMap<>();
        int num=(pageNo-1)*pageSize;
        map.put("pageNo",num);
        map.put("pageSize",pageSize);
        List<Figure> list=fiMapper.select(map);
        return list;
    }

    @Override
    public boolean add(Figure figure) {
        return fiMapper.add(figure);
    }

    @Override
    public List<Figure> findById(int f_id) {
        return fiMapper.findById(f_id);
    }

    @Override
    public boolean update(Figure figure) {
        return fiMapper.update(figure);
    }

    @Override
    public boolean delete(int f_id) {
        return fiMapper.delete(f_id);
    }
}
