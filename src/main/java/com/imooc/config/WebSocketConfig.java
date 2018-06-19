package com.imooc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * @auther jiahaowei
 * @date： 2017/12/20 0020
 * @time： 13:06
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
//@Component
public class WebSocketConfig {

    @Bean
    public ServerEndpointExporter serverEndpointExporter(){

        return new ServerEndpointExporter();
    }

}
