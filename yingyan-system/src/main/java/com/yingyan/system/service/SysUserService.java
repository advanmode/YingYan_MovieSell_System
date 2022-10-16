package com.yingyan.system.service;

import com.yingyan.system.domin.LoginUser;
import com.yingyan.system.domin.SysMovie;
import com.yingyan.system.domin.SysUser;
import com.yingyan.system.domin.vo.SysUserVo;

import java.util.List;


public interface SysUserService {
    List<SysUser> findAll(SysUser sysUser);

    SysUser findById(Long id);

    SysUser findByName(String userName);

    int add(SysUser sysUser);

    int update(SysUser sysUser);

    int delete(Long[] ids);

    LoginUser login(SysUserVo sysUserVo);

    LoginUser findLoginUser(SysUserVo sysUserVo);

    boolean isUserNameUnique(String userName, Long userId);
}
