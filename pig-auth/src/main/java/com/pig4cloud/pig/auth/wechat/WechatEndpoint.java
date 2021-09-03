package com.pig4cloud.pig.auth.wechat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.pig4cloud.pig.common.core.util.R;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/auth/wechat")
public class WechatEndpoint {


	public R wechat_login(@RequestParam(value = "code", required = false) String code,
						  @RequestParam(value = "rawData", required = false) String rawData,
						  @RequestParam(value = "signature", required = false) String signature,
						  @RequestParam(value = "encrypteData", required = false) String encrypteData,
						  @RequestParam(value = "iv", required = false) String iv) {
		JSONObject rawDataJson = JSON.parseObject(rawData);
		// 1.接收小程序发送的code
		// 2.开发者服务器 登录凭证校验接口 appi + appsecret + code

		return null;
	}
}
