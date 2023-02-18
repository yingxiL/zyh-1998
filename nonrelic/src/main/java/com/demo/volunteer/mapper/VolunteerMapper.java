package com.demo.volunteer.mapper;

import com.demo.volunteer.entity.Volunteer;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface VolunteerMapper {
    public List<Volunteer> select();
}
