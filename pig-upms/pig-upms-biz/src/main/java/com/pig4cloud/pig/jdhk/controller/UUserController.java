/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.pig4cloud.pig.jdhk.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.common.log.annotation.SysLog;
import com.pig4cloud.pig.jdhk.entity.UUser;
import com.pig4cloud.pig.jdhk.service.UUserService;
import org.springframework.security.access.prepost.PreAuthorize;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


/**
 * 用户表
 *
 * @author Sean Guo
 * @date 2021-09-08 19:08:30
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/uuser" )
@Api(value = "uuser", tags = "用户表管理")
public class UUserController {

    private final  UUserService uUserService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param uUser 用户表
     * @return
     */
    @ApiOperation(value = "分页查询", notes = "分页查询")
    @GetMapping("/page" )
    @PreAuthorize("@pms.hasPermission('demo_uuser_get')" )
    public R getUUserPage(Page page, UUser uUser) {
        return R.ok(uUserService.page(page, Wrappers.query(uUser)));
    }


    /**
     * 通过id查询用户表
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id查询", notes = "通过id查询")
    @GetMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('demo_uuser_get')" )
    public R getById(@PathVariable("id" ) Integer id) {
        return R.ok(uUserService.getById(id));
    }

    /**
     * 新增用户表
     * @param uUser 用户表
     * @return R
     */
    @ApiOperation(value = "新增用户表", notes = "新增用户表")
    @SysLog("新增用户表" )
    @PostMapping
    @PreAuthorize("@pms.hasPermission('demo_uuser_add')" )
    public R save(@RequestBody UUser uUser) {
        return R.ok(uUserService.save(uUser));
    }

    /**
     * 修改用户表
     * @param uUser 用户表
     * @return R
     */
    @ApiOperation(value = "修改用户表", notes = "修改用户表")
    @SysLog("修改用户表" )
    @PutMapping
    @PreAuthorize("@pms.hasPermission('demo_uuser_edit')" )
    public R updateById(@RequestBody UUser uUser) {
        return R.ok(uUserService.updateById(uUser));
    }

    /**
     * 通过id删除用户表
     * @param id id
     * @return R
     */
    @ApiOperation(value = "通过id删除用户表", notes = "通过id删除用户表")
    @SysLog("通过id删除用户表" )
    @DeleteMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('demo_uuser_del')" )
    public R removeById(@PathVariable Integer id) {
        return R.ok(uUserService.removeById(id));
    }

}
