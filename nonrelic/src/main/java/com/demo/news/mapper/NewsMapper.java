package com.demo.news.mapper;

import com.demo.news.entity.News;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface NewsMapper {
    public List<News> select();
}
