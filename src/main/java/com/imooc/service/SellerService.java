package com.imooc.service;

import com.imooc.dataobject.SellerInfo;

/**
 * @auther jiahaowei
 * @date： 2017/12/15 0015
 * @time： 13:13
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface SellerService {

    /**
     * 通过openid查询卖家端信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
