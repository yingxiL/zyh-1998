package com.demo.news.biz;

import com.demo.news.entity.News;
import java.util.List;

public interface NewsBiz {
    public List<News> select();
}
