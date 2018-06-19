package com.imooc.dataobject;

import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * @auther jiahaowei
 * @date： 2017/9/11 0011
 * @time： 11:49
 * @project_name： mc_springboot_dinner
 * @Description ：类目
 */
@Entity
//动态更新时间
@DynamicUpdate
@Data
public class ProductCategory {
    @Id
    @GeneratedValue
    /** 类目  id*/
    private Integer categoryId;

    /**
     * 类目  名字
     */
    private String categoryName;

    /**
     * 类目  编号
     */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

    public ProductCategory() {
    }

    public ProductCategory(String categoryName, Integer categoryType) {
        this.categoryName = categoryName;
        this.categoryType = categoryType;
    }
}
