package com.demo.img.mapper;

import com.demo.img.entity.Img;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ImgMapper {
    public List<Img> select();
    public List<Img> select1();
    public List<Img> select2();
    public List<Img> select3();
}
