package com.imooc.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Date;

/**
 * @auther jiahaowei
 * @date： 2017/12/15 0015
 * @time： 10:01
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Data
@Entity
public class SellerInfo {

    @Id
    private String sellerId;

    private String username;

    private String password;

    private String openid;

    // private Date createTime;

  //  private Date updateTime;
}
