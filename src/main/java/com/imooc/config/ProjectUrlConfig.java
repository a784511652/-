package com.imooc.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @auther jiahaowei
 * @date： 2017/12/15 0015
 * @time： 15:22
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Data
@Component
@ConfigurationProperties(prefix = "projectUrl")
public class ProjectUrlConfig {

    /**
     * 微信公众平台授权url
     */
    public String wechatMpAuthorize;

    /**
     * 微信开放平台授权url
     */
    public String wechatOpenAuthorize;

    /**
     * 点餐系统
     */
    public String sell;
}

