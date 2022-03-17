package com.ctgu.service;

import com.ctgu.entity.Permission;
import com.ctgu.entity.Role;
import com.ctgu.entity.RolePermission;
import com.ctgu.entity.RolePermissionExample;
import com.ctgu.mapper.RolePermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolePermissionService {

    @Autowired
    RolePermissionMapper rolePermissionMapper;

    public void setPermissions(Role role, List<Integer> pids) {
        //移除角色旧的权限
        RolePermissionExample rolePermissionExample = new RolePermissionExample();
        rolePermissionExample.createCriteria().andRidEqualTo(role.getId());
        List<RolePermission> rps = rolePermissionMapper.selectByExample(rolePermissionExample);
        for (RolePermission rp : rps ) {
            rolePermissionMapper.deleteByPrimaryKey(rp.getId());
        }

        //赋予新的权限
        if (null != pids)
            for (int pid : pids) {
                RolePermission rp = new RolePermission();
                rp.setPid(pid);
                rp.setRid(role.getId());
                rolePermissionMapper.insert(rp);
            }
    }

    public void deleteByRole(Role role) {
        RolePermissionExample rolePermissionExample = new RolePermissionExample();
        rolePermissionExample.createCriteria().andRidEqualTo(role.getId());
        List<RolePermission> rps = rolePermissionMapper.selectByExample(rolePermissionExample);
        for (RolePermission rp : rps ) {
            rolePermissionMapper.deleteByPrimaryKey(rp.getId());
        }
    }

    public void deleteByPermission(Permission permission) {
        RolePermissionExample rolePermissionExample = new RolePermissionExample();
        rolePermissionExample.createCriteria().andPidEqualTo(permission.getId());
        List<RolePermission> rps = rolePermissionMapper.selectByExample(rolePermissionExample);
        for (RolePermission rp : rps ) {
            rolePermissionMapper.deleteByPrimaryKey(rp.getId());
        }
    }
}
