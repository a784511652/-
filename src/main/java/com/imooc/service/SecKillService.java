package com.imooc.service;

/**
 * @auther jiahaowei
 * @date： 2017/12/23 0023
 * @time： 12:00
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public interface SecKillService {
    /**
     * 查询秒杀活动特价商品的信息
     * @param productId
     * @return
     */
    String querySecKillProductInfo(String productId);

    /**
     * 模拟不同用户秒杀同一商品的请求
     * @param productId
     * @return
     */
    void orderProductMockDiffUser(String productId);
}
