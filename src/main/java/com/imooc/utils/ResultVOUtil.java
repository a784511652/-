package com.imooc.utils;

import com.imooc.VO.ResultVO;

import java.util.Objects;

/**
 * @auther jiahaowei
 * @date： 2017/9/16 0016
 * @time： 23:53
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
public class ResultVOUtil {

    public static ResultVO<Object> success(Object object){
        ResultVO<Object> resultVO = new ResultVO<>();
        resultVO.setMsg("成功");
        resultVO.setCode(0);
        resultVO.setData(object);
        return resultVO;
    }


    public static ResultVO success(){
        return success(null);
    }


    public static ResultVO error(Integer code,String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
