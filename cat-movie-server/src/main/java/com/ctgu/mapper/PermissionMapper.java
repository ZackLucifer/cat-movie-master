package com.ctgu.mapper;

import com.ctgu.entity.Permission;
import com.ctgu.entity.PermissionExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Permission record);

    int insertSelective(Permission record);

    List<Permission> selectByExample(PermissionExample example);

    Permission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Permission record);

    int updateByPrimaryKey(Permission record);
}