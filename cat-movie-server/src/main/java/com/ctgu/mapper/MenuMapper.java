package com.ctgu.mapper;

import com.ctgu.entity.Menu;
import com.ctgu.entity.MenuExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Menu record);

    int insertSelective(Menu record);

    List<Menu> selectByExample(MenuExample example);

    Menu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}