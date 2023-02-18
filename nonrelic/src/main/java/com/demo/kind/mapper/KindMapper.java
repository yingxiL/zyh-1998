package com.demo.kind.mapper;

import com.demo.kind.entity.Kind;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface KindMapper {
    public List<Kind> select();
}
