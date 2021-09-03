package com.pig4cloud.pig.auth.wechat;

import lombok.Builder;
import lombok.Data;

@Data
public class WechatAccessTokenRequest {

	private String appId;

	private String secret;

	private String code;

	@Builder.Default
	private String grantType = "authorization_code";
}
