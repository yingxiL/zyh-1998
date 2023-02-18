package com.demo.drawer.mapper;

import com.demo.drawer.entity.Drawer;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DrawerMapper {
    public List<Drawer> select();
}
