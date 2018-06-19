package com.imooc.exception;

import com.imooc.enums.ResultEnum;
import lombok.Getter;

/**
 * @auther jiahaowei
 * @date： 2017/9/20 0020
 * @time： 10:15
 * @project_name： mc_springboot_dinner
 * @Description ：
 *
 *
 */
@Getter
public class SellException extends RuntimeException{
    private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message ) {
        super(message);
        this.code = code;
    }
}
