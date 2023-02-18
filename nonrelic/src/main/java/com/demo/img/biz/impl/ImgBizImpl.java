package com.demo.img.biz.impl;

import com.demo.img.entity.Img;
import com.demo.img.mapper.ImgMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("imgBiz")
public class ImgBizImpl implements ImgBiz {
    @Autowired
    private ImgMapper imgMapper;
    @Override
    public List<Img> select() {
        return imgMapper.select();
    }

    @Override
    public List<Img> select1() {
        return imgMapper.select1();
    }

    @Override
    public List<Img> select2() {
        return imgMapper.select2();
    }

    @Override
    public List<Img> select3() {
        return imgMapper.select3();
    }
}
