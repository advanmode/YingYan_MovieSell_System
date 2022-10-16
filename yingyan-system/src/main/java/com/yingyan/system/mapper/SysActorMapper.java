package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysActor;
import com.yingyan.system.domin.SysUser;

import java.util.List;


public interface SysActorMapper {
    List<SysActor> findAll(SysActor sysActor);

    SysActor findById(Long id);

    int add(SysActor sysActor);

    int update(SysActor sysActor);

    int delete(Long id);

    SysActor findActorById(Long id);

    /**
     * 根据电影id查询所有主演名称
     * @param id
     * @return
     */
    List<String> findaMajorActorNames(Long id);
}
