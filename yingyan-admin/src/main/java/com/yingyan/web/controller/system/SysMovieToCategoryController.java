package com.yingyan.web.controller.system;

import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysMovieToCategory;
import com.yingyan.system.service.impl.SysMovieToCategoryServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class SysMovieToCategoryController extends BaseController {

    @Autowired
    private SysMovieToCategoryServiceImpl sysMovieToCategoryService;

    @GetMapping("/sysMovieToCategory")
    public ResponseResult findAll(SysMovieToCategory sysMovieToCategory){
        startPage();
        return getResult(sysMovieToCategoryService.findAll(sysMovieToCategory));
    }

    @PostMapping("/sysMovieToCategory/{movieId}/{movieCategoryId}")
    public ResponseResult add(@PathVariable Long movieId, @PathVariable Long movieCategoryId){
        return getResult(sysMovieToCategoryService.add(new SysMovieToCategory(movieId, movieCategoryId)));
    }

    @DeleteMapping("/sysMovieToCategory/{movieId}/{movieCategoryId}")
    public ResponseResult delete(@PathVariable Long movieId, @PathVariable Long movieCategoryId){
        return getResult(sysMovieToCategoryService.delete(new SysMovieToCategory(movieId, movieCategoryId)));
    }

}
