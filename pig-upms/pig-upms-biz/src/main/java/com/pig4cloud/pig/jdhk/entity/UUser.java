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
package com.pig4cloud.pig.jdhk.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.pig4cloud.pig.common.mybatis.base.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * 用户表
 *
 * @author Sean Guo
 * @date 2021-09-08 19:08:30
 */
@Data
@TableName("u_user")
@EqualsAndHashCode(callSuper = true)
@ApiModel(value = "用户表")
public class UUser extends BaseEntity {

    /**
     * id
     */
    @TableId
    @ApiModelProperty(value="id")
    private Integer id;

    /**
     * userName
     */
    @ApiModelProperty(value="userName")
    private String userName;

    /**
     * mobile
     */
    @ApiModelProperty(value="mobile")
    private String mobile;

    /**
     * password
     */
    @ApiModelProperty(value="password")
    private String password;

    /**
     * wechatId
     */
    @ApiModelProperty(value="wechatId")
    private String wechatId;

	/**
	 * avatarUrl
	 */
	@ApiModelProperty(value="avatarUrl")
	private String avatarUrl;

}
