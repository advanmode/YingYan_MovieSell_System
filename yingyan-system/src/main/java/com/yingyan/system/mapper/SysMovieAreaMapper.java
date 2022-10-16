package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysMovieAge;
import com.yingyan.system.domin.SysMovieArea;

import java.util.List;


public interface SysMovieAreaMapper {
    /**
     * 查询所有电影区域
     * @return
     */
    List<SysMovieArea> findAll();

    /**
     * 根据id查询电影区域
     * @param id
     * @return
     */
    SysMovieArea findById(Long id);

    /**
     * 添加电影区域信息
     * @param sysMovieArea
     * @return
     */
    int add(SysMovieArea sysMovieArea);


    /**
     * 更新电影区域信息
     * @param sysMovieArea
     * @return
     */
    int update(SysMovieArea sysMovieArea);

    /**
     * 删除指定id的电影区域
     * @param id
     */
    int delete(Long id);
}
