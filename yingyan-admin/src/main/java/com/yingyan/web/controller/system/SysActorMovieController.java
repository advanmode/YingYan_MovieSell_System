package com.yingyan.web.controller.system;

import com.yingyan.common.response.ResponseResult;
import com.yingyan.system.domin.SysActorMovie;
import com.yingyan.system.service.impl.SysActorMovieServiceImpl;
import com.yingyan.web.controller.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


@RestController
public class SysActorMovieController extends BaseController {

    @Autowired
    private SysActorMovieServiceImpl sysActorMovieService;

    @GetMapping("/sysActorMovie")
    public ResponseResult findAll(SysActorMovie sysActorMovie){
        startPage();
        return getResult(sysActorMovieService.findAll(sysActorMovie));
    }

    @PostMapping("/sysActorMovie")
    public ResponseResult add(@Validated @RequestBody SysActorMovie sysActorMovie){
        return getResult(sysActorMovieService.add(sysActorMovie));
    }

    @DeleteMapping("/sysActorMovie/{movieId}/{actorId}/{actorRoleId}")
    public ResponseResult delete(@PathVariable Long movieId, @PathVariable Long actorId, @PathVariable Long actorRoleId){
        return getResult(sysActorMovieService.delete(new SysActorMovie(movieId, actorId, actorRoleId)));
    }

}
