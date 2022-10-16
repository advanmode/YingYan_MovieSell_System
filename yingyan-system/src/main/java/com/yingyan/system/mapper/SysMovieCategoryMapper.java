package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysMovieArea;
import com.yingyan.system.domin.SysMovieCategory;

import java.util.List;


public interface SysMovieCategoryMapper {

    /**
     * 查询所有电影分类
     * @return
     */
    List<SysMovieCategory> findAll();

    /**
     * 根据id查询电影分类
     * @param id
     * @return
     */
    SysMovieCategory findById(Long id);

    /**
     * 根据电影id查询所属的全部类别
     * @param id
     * @return
     */
    List<SysMovieCategory> findByMovieId(Long id);

    /**
     * 添加一个电影分类
     * @param sysMovieCategory
     * @return
     */
    int add(SysMovieCategory sysMovieCategory);

    /**
     * 更新电影分类信息
     * @param sysMovieCategory
     * @return
     */
    int update(SysMovieCategory sysMovieCategory);

    /**
     * 根据id删除电影分类
     * @param id
     * @return
     */
    int delete(Long id);
}
