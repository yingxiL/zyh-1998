package com.demo.admin.biz.impl;

import com.demo.admin.biz.AdminBiz;
import com.demo.admin.entity.Sadmin;
import com.demo.admin.entity.Vadmin;
import com.demo.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("adminBiz")
public class AdminBizImpl implements AdminBiz {
    @Autowired
    private AdminMapper adminMapper;
    @Override
    public List<Sadmin> login1(String s_account, String s_pwd) {
        return adminMapper.login1(s_account, s_pwd);
    }

    @Override
    public List<Vadmin> login2(String v_account,String v_pwd) {
        return adminMapper.login2(v_account,v_pwd);
    }

    @Override
    public List<Sadmin> select1(int pageNo, int pageSize) {
        List<Sadmin> list=adminMapper.select1(pageNo, pageSize);
        return list;
    }

    @Override
    public List<Vadmin> select(int pageNo, int pageSize) {
        //Map<String,Object> map=new HashMap<>();
        List<Vadmin> list=adminMapper.select(pageNo, pageSize);
        return list;
    }

    @Override
    public boolean add1(Sadmin sadmin) {
        return adminMapper.add1(sadmin);
    }

    @Override
    public boolean add2(Vadmin vadmin) {
        return adminMapper.add2(vadmin);
    }

    @Override
    public List<Sadmin> findById1(int s_id) {
        return adminMapper.findById1(s_id);
    }

    @Override
    public List<Vadmin> findById2(int v_id) {
        return adminMapper.findById2(v_id);
    }

    @Override
    public boolean update1(Sadmin sadmin) {
        boolean bl = adminMapper.update1(sadmin);
        return bl;
    }

    @Override
    public boolean update2(Vadmin vadmin) {
        boolean bl = adminMapper.update2(vadmin);
        return bl;
    }

    @Override
    public boolean delete1(int s_id) {
        return adminMapper.delete1(s_id);
    }

    @Override
    public boolean delete2(int v_id) {
        return adminMapper.delete2(v_id);
    }
}
