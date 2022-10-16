package com.yingyan.system.service;

import com.yingyan.system.domin.SysActorRole;
import com.yingyan.system.domin.SysMovieAge;

import java.util.List;


public interface SysActorRoleService {
    List<SysActorRole> findAll();

    SysActorRole findById(Long id);

    int add(SysActorRole sysActorRole);

    int update(SysActorRole sysActorRole);

    int delete(Long[] ids);
}
