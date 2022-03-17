package com.ctgu.mapper;

import com.ctgu.entity.RoleMenu;
import com.ctgu.entity.RoleMenuExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RoleMenu record);

    int insertSelective(RoleMenu record);

    List<RoleMenu> selectByExample(RoleMenuExample example);

    RoleMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RoleMenu record);

    int updateByPrimaryKey(RoleMenu record);
}