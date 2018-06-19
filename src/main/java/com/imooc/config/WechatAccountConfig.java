package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import javax.net.ssl.SSLContext;
import java.util.Map;

/**
 * @auther jiahaowei
 * @date： 2017/11/1 0001
 * @time： 14:30
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {

    private String mpAppId;

    private String mpAppSecret;

    private String openAppId;

    private String openAppSecret;

    private String mchId;

    private String mchKey;

    private String keyPath;

    private String notifyUrl;

    private Map<String,String> templateId;

    private SSLContext sslContext;
}
