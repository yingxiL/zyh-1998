package com.demo.volunteer.biz.impl;

import com.demo.type.biz.impl.TypeBiz;
import com.demo.volunteer.entity.Volunteer;
import com.demo.volunteer.mapper.VolunteerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("voBiz")
public class VoBizImpl implements VoBiz {
    @Autowired
    private VolunteerMapper volunteerMapper;
    @Override
    public List<Volunteer> select() {
        return volunteerMapper.select();
    }
}
