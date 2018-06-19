package com.imooc.form;

import lombok.Data;

/**
 * @auther jiahaowei
 * @date： 2017/12/14 0014
 * @time： 16:28
 * @project_name： mc_springboot_dinner
 * @Description ：
 */
@Data
public class CategoryForm {

    private Integer categoryId;

    /** 类目名字. */
    private String categoryName;

    /** 类目编号. */
    private Integer categoryType;
}
