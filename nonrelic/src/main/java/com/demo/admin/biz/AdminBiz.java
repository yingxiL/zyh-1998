package com.demo.admin.biz;

import com.demo.admin.entity.Sadmin;
import com.demo.admin.entity.Vadmin;

import java.util.List;

public interface AdminBiz {
    public List<Sadmin> login1(String s_account,String s_pwd);
    public List<Vadmin> login2(String v_account,String v_pwd);
    public List<Sadmin> select1(int pageNo,int pageSize);
    public List<Vadmin> select(int pageNo,int pageSize);
    public boolean add1(Sadmin sadmin);
    public boolean add2(Vadmin vadmin);
    public List<Sadmin> findById1(int s_id);
    public List<Vadmin> findById2(int v_id);
    public boolean update1(Sadmin sadmin);
    public boolean update2(Vadmin vadmin);
    public boolean delete1(int s_id);
    public boolean delete2(int v_id);

}
