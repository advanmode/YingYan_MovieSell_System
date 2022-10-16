package com.yingyan.web.controller.system;

import com.github.pagehelper.PageHelper;
import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysMovieAge;
import com.yingyan.system.service.impl.SysMovieAgeServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class SysMovieAgeController extends BaseController {

    @Autowired
    SysMovieAgeServiceImpl sysMovieAgeService;

    @GetMapping("/sysMovieAge")
    public ResponseResult findAll(){
        startPage();
        List<SysMovieAge> data = sysMovieAgeService.findAll();
        return getResult(data);
    }

    @GetMapping("/sysMovieAge/{id}")
    public ResponseResult findById(@PathVariable Long id){
        return getResult(sysMovieAgeService.findById(id));
    }

    @PostMapping("/sysMovieAge")
    public ResponseResult add(@Validated @RequestBody SysMovieAge sysMovieAge){
        return getResult(sysMovieAgeService.add(sysMovieAge));
    }

    /**
     * 通过@Validated验证前端传来的数据正确性，使用BindResult接收结果
     * @param sysMovieAge
     */
    @PutMapping("/sysMovieAge")
    public ResponseResult update(@Validated @RequestBody SysMovieAge sysMovieAge){
        return getResult(sysMovieAgeService.update(sysMovieAge));
    }

    @DeleteMapping("/sysMovieAge/{ids}")
    public ResponseResult delete(@PathVariable Long[] ids){
        return getResult(sysMovieAgeService.delete(ids));
    }

}
