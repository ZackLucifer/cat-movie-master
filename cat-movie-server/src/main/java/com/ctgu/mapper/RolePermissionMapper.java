package com.ctgu.mapper;

import com.ctgu.entity.RolePermission;
import com.ctgu.entity.RolePermissionExample;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RolePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RolePermission record);

    int insertSelective(RolePermission record);

    List<RolePermission> selectByExample(RolePermissionExample example);

    RolePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RolePermission record);

    int updateByPrimaryKey(RolePermission record);
}