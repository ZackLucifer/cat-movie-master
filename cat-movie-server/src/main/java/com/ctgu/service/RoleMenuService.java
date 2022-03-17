package com.ctgu.service;

import com.ctgu.entity.Menu;
import com.ctgu.entity.Role;
import com.ctgu.entity.RoleMenu;
import com.ctgu.entity.RoleMenuExample;
import com.ctgu.mapper.RoleMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleMenuService {

    @Autowired
    RoleMenuMapper roleMenuMapper;

    @Transactional
    public void setMenus(Role role,List<Integer> mids) {
        RoleMenuExample example = new RoleMenuExample();
        example.createCriteria().andRidEqualTo(role.getId());
        List<RoleMenu> rms = roleMenuMapper.selectByExample(example);
        for (RoleMenu rm : rms) {
            roleMenuMapper.deleteByPrimaryKey(rm.getId());
        }

        if (mids != null)
            for (int mid : mids) {
                RoleMenu rm = new RoleMenu();
                rm.setMid(mid);
                rm.setRid(role.getId());
                roleMenuMapper.insert(rm);
            }
    }

    @Transactional
    public void deleteByRole(Role role) {
        RoleMenuExample example = new RoleMenuExample();
        example.createCriteria().andRidEqualTo(role.getId());
        List<RoleMenu> rms = roleMenuMapper.selectByExample(example);
        for (RoleMenu rm : rms) {
            roleMenuMapper.deleteByPrimaryKey(rm.getId());
        }
    }

    @Transactional
    public void deleteByMenu(Menu menu) {
        RoleMenuExample example = new RoleMenuExample();
        example.createCriteria().andMidEqualTo(menu.getId());
        List<RoleMenu> rms = roleMenuMapper.selectByExample(example);
        for (RoleMenu rm : rms) {
            roleMenuMapper.deleteByPrimaryKey(rm.getId());
        }
    }
}
