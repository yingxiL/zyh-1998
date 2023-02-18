package com.demo.figure.biz.impl;

import com.demo.figure.entity.Figure;
import java.util.List;
import java.util.Map;

public interface FigureBiz {
    public List<Figure> select(int pageNo,int pageSize);
    public boolean add(Figure figure);
    public List<Figure> findById(int f_id);
    public boolean update(Figure figure);
    public boolean delete(int f_id);
}
