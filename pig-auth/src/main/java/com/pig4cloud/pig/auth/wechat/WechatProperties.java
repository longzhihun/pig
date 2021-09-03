package com.pig4cloud.pig.auth.wechat;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "wechat")
public class WechatProperties {
	private String appId;
	private String secret;
}
