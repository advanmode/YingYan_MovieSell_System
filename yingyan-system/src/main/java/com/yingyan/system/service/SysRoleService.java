package com.yingyan.system.service;

import com.yingyan.system.domin.SysRole;

import java.util.List;


public interface SysRoleService {
    List<SysRole> findAll();

    SysRole findById(Long id);

    int add(SysRole sysRole);

    int update(SysRole sysRole);

    int delete(Long[] ids);

    int allotRight(Long roleId, Long[] resourceIds);
}
