package com.demo.news.biz.impl;

import com.demo.news.biz.NewsBiz;
import com.demo.news.entity.News;
import com.demo.news.mapper.NewsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("newsBiz")
public class NewsBizImpl implements NewsBiz {
    @Autowired
    private NewsMapper newsMapper;
    @Override
    public List<News> select() {
        return newsMapper.select();
    }
}
