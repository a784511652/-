package com.imooc.service.impl;

import com.imooc.config.WechatAccountConfig;
import com.imooc.dto.OrderDTO;
import com.imooc.service.PushMessageService;
import lombok.extern.slf4j.Slf4j;
import me.chanjar.weixin.common.exception.WxErrorException;
import me.chanjar.weixin.mp.api.WxMpService;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateData;
import me.chanjar.weixin.mp.bean.template.WxMpTemplateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/12/20 0020
 * @time： 10:19
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Service
@Slf4j
public class PushMessageImpl implements PushMessageService {

    @Autowired
    private WxMpService wxMpService;

    @Autowired
    private WechatAccountConfig accountConfig;

    public void orderStatus(OrderDTO orderDTO) {
        WxMpTemplateMessage templateMessage = new WxMpTemplateMessage();
        //填入模板ID
        templateMessage.setTemplateId(accountConfig.getTemplateId().get("orderStatus"));
        //12.9openID
        templateMessage.setToUser(orderDTO.getBuyerOpenid());

        List<WxMpTemplateData> data = Arrays.asList(
                new WxMpTemplateData("first","亲，请记住收获"),
                new WxMpTemplateData("keyword1","微信点餐"),
                new WxMpTemplateData("keyword2","13831070028"),
                new WxMpTemplateData("keyword3",orderDTO.getOrderId()),
                new WxMpTemplateData("keyword4",orderDTO.getOrderStatusEnum().getMessage()),
                new WxMpTemplateData("keyword5","￥"+ orderDTO.getOrderAmount()),
                new WxMpTemplateData("remark","欢迎再次光临！")
        );
        templateMessage.setData(data);
        try {
            wxMpService.getTemplateMsgService().sendTemplateMsg(templateMessage);
        } catch (WxErrorException e) {
            log.error("【微信模版发送】发送失败，{}",e);
        }
    }
}
