package com.ctgu.controller;

import com.ctgu.entity.Permission;
import com.ctgu.service.PermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PermissionController {

    private final PermissionService permissionService;

    public PermissionController(PermissionService permissionService) {
        this.permissionService = permissionService;
    }

    @GetMapping("api/admin/role/perms")
    public List<Permission> list() {
        return permissionService.list();
    }

}
