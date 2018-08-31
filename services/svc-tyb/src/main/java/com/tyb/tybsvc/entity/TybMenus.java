package com.tyb.tybsvc.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Auth: tyb
 * @Date: 18-8-31 上午9:56
 * @Desc:
 */
/*@Entity
@Table(name = "flowerpoints", catalog = "vas")
@DynamicInsert
@DynamicUpdate*/
public class TybMenus {

    private Long menuId;//菜单id
    private String menuName;//菜单名称
    private Long menuParentid;//父级id
    private String menuUrl;//菜单路径
    private String imgUrl;//图片路径
    private int imgWidth;//图片宽度
    private int imgHeight;//图片高度
    private String menuType;//菜单类型

}
