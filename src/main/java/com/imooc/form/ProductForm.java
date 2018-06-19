package com.imooc.form;

import lombok.Data;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @auther jiahaowei
 * @date： 2017/12/14 0014
 * @time： 13:20
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Data
public class ProductForm {

    private String productId;

    /** 名字. */
    private String productName;

    /** 单价. */
    private BigDecimal productPrice;

    /** 库存. */
    private Integer productStock;

    /** 描述. */
    private String productDescription;

    /** 小图. */
    private String productIcon;

    /** 类目编号. */
    private Integer categoryType;

}
