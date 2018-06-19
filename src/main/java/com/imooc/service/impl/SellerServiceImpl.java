package com.imooc.service.impl;

import com.imooc.dataobject.SellerInfo;
import com.imooc.repository.SellerInfoRepository;
import com.imooc.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @auther jiahaowei
 * @date： 2017/12/15 0015
 * @time： 13:23
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Service
public class SellerServiceImpl implements SellerService {

    @Autowired
    private SellerInfoRepository repository;


    public SellerInfo findSellerInfoByOpenid(String openid) {
        return repository.findByOpenid(openid);
    }
}
