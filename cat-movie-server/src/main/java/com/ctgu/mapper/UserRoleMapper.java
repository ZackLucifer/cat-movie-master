package com.ctgu.mapper;

import com.ctgu.entity.UserRole;
import com.ctgu.entity.UserRoleExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRoleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    List<UserRole> selectByExample(UserRoleExample example);

    UserRole selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}