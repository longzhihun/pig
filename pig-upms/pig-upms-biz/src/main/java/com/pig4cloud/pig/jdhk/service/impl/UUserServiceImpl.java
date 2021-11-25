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
package com.pig4cloud.pig.jdhk.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pig4cloud.pig.jdhk.entity.UUser;
import com.pig4cloud.pig.jdhk.mapper.UUserMapper;
import com.pig4cloud.pig.jdhk.service.UUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

/**
 * 用户表
 *
 * @author Sean Guo
 * @date 2021-09-08 19:08:30
 */
@Service
public class UUserServiceImpl extends ServiceImpl<UUserMapper, UUser> implements UUserService {

	private static final PasswordEncoder ENCODER = new BCryptPasswordEncoder();

	@Autowired
	private UUserMapper uUserMapper;

	@Override
	public boolean saveUuser(UUser uUser) {
		uUser.setAvatarUrl("/static/images/default_avatar.png");
		uUser.setPassword(ENCODER.encode(uUser.getPassword()));
		uUserMapper.insert(uUser);
		return true;
	}
}
