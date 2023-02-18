package com.demo.drawer.biz.impl;

import com.demo.drawer.entity.Drawer;
import com.demo.drawer.mapper.DrawerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("drawerBiz")
public class DrawerBizImpl implements DrawerBiz {
    @Autowired
    private DrawerMapper drawerMapper;
    @Override
    public List<Drawer> select() {
        return drawerMapper.select();
    }
}
