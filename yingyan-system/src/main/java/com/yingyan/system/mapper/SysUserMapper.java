package com.yingyan.system.mapper;

import com.yingyan.system.domin.LoginUser;
import com.yingyan.system.domin.SysUser;
import com.yingyan.system.domin.vo.SysUserVo;

import java.util.List;


public interface SysUserMapper {
    List<SysUser> findAll(SysUser sysUser);

    SysUser findById(Long id);

    SysUser findByName(String userName);

    int add(SysUser sysUser);

    int update(SysUser sysUser);

    int delete(Long id);

    LoginUser findLoginUser(SysUserVo sysUserVo);

    /**
     * 查出指定名字用户的所有id
     * @param userName
     * @return
     */
    List<Long> findUsersByName(String userName);
}
