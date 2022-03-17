package com.ctgu.service;

import com.ctgu.entity.Category;
import com.ctgu.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    CategoryMapper categoryMapper;

    public Category get(int id) {
        Category c = Optional.ofNullable(categoryMapper.getById(id)).orElse(null);
        return c;
    }
}
