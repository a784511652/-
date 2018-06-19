package com.imooc.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;
import com.imooc.dataobject.ProductInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/9/15 0015
 * @time： 13:07
 * @project_name： mc_springboot_dinner
 * @Description ：商品包含类目
 */
@Data
public class ProductVO {

    @JsonProperty("name")
   // @SerializedName("Topic")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;


}
