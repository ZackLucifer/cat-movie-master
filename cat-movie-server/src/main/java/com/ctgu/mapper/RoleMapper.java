package com.ctgu.mapper;

import com.ctgu.entity.Role;
import com.ctgu.entity.RoleExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}