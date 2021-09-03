package com.pig4cloud.pig.auth.wechat;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "wechat", url = "https://api.weixin.qq.com/sns/oauth2")
public interface WechatClient {

}
