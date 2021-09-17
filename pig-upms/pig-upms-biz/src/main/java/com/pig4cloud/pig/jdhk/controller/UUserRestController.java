package com.pig4cloud.pig.jdhk.controller;

import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.pig4cloud.pig.common.core.util.R;
import com.pig4cloud.pig.common.log.annotation.SysLog;
import com.pig4cloud.pig.common.security.annotation.Inner;
import com.pig4cloud.pig.jdhk.entity.UUser;
import com.pig4cloud.pig.jdhk.service.UUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/uuser/rest" )
@Api(value = "uuser", tags = "用户微信端")
public class UUserRestController {

	private final UUserService uUserService;

	/**
	 * 新增用户表
	 * @param uUser
	 * @return R
	 */
	@ApiOperation(value = "注册用户", notes = "注册用户")
	@SysLog("注册用户" )
	@PostMapping("register")
	public R save(@RequestBody UUser uUser) {
		return R.ok(uUserService.saveUuser(uUser));
	}


	/**
	 * 获取用户全部信息
	 * @return 用户信息
	 */
	@Inner
	@GetMapping("/info/{mobile}")
	public R info(@PathVariable String mobile) {
		UUser user = uUserService.getOne(Wrappers.<UUser>query().lambda().eq(UUser::getMobile, mobile));
		if (user == null) {
			return R.failed(String.format("用户信息为空 %s", mobile));
		}
		return R.ok(user);
	}
}
