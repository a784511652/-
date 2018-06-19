package com.imooc.config;

import com.lly835.bestpay.config.WxPayH5Config;
import com.lly835.bestpay.service.impl.BestPayServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @auther jiahaowei
 * @date： 2017/11/3 0003
 * @time： 13:26
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Component
public class WechatPayConfig {

    @Autowired
    private WechatAccountConfig accountConfig;

    @Bean
    public BestPayServiceImpl bestPayService(){

        BestPayServiceImpl bestPayService = new BestPayServiceImpl();
        bestPayService.setWxPayH5Config(wxPayH5Config());
        return bestPayService;

    }

    @Bean
    public WxPayH5Config wxPayH5Config(){
        WxPayH5Config wxPayH5Config = new WxPayH5Config();
        wxPayH5Config.setAppId(accountConfig.getMpAppId());
        wxPayH5Config.setAppSecret(accountConfig.getMpAppSecret());
        wxPayH5Config.setMchKey(accountConfig.getMchKey());
        wxPayH5Config.setMchId(accountConfig.getMchId());
        wxPayH5Config.setKeyPath(accountConfig.getKeyPath());
        return wxPayH5Config;
    }
}
