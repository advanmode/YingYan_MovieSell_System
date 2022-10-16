package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysUserHobby;

import java.util.List;


public interface SysUserHobbyMapper {

    /**
     * 查询所有
     * @return
     */
    List<SysUserHobby> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    SysUserHobby findById(Long id);

    /**
     * 添加用户爱好
     * @param sysUserHobby
     * @return 影响行数
     */
    int add(SysUserHobby sysUserHobby);

    /**
     * 修改用户爱好名称
     * @param sysUserHobby
     */
    int update(SysUserHobby sysUserHobby);

    /**
     * 删除指定id的用户爱好
     * @param id
     */
    int delete(Long id);

}
