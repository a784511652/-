package com.imooc.VO;

import lombok.Data;

/**
 * @auther jiahaowei
 * @date： 2017/9/15 0015
 * @time： 11:40
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Data
public class ResultVO<T>{

    // 错误码
    private Integer code;

    // 提示信息
    private String msg;

    // 具体内容
    private T data;
}

