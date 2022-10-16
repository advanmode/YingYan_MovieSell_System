package com.yingyan.system.mapper;

import com.yingyan.system.domin.SysHallCategory;
import com.yingyan.system.domin.SysMovieAge;

import java.util.List;




public interface SysHallCategoryMapper {
    /**
     * 查询所有影厅分类信息
     * @return
     */
    List<SysHallCategory> findAll();

    /**
     * 根据id查询影厅分类信息
     * @param id
     * @return
     */
    SysHallCategory findById(Long id);

    /**
     * 根据影院id查询影院包含的特殊厅
     * @param id
     * @return
     */
    List<SysHallCategory> findByCinemaId(Long id);

    /**
     * 添加影厅分类信息
     * @param sysHallCategory
     */
    int add(SysHallCategory sysHallCategory);

    /**
     * 修改影厅分类信息
     * @param sysHallCategory
     */
    int update(SysHallCategory sysHallCategory);

    /**
     * 删除指定id的影厅分类
     * @param id
     */
    int delete(Long id);
}
