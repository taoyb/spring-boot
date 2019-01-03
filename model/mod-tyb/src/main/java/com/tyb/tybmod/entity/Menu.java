package com.tyb.tybmod.entity;

import com.tyb.infra.jpa.BaseEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.List;

/**
 * @Auth: tyb
 * @Date: 19-1-2 下午12:00
 * @Desc:
 */
@Entity
@Table(name = "menus", catalog = "simon")
@DynamicInsert
@DynamicUpdate
public class Menu extends BaseEntity {
    @Column
    private String name;
    @OneToMany(targetEntity = Menu.class)  // targetEntity 必须写
    @JoinColumn(name = "parentid")
    private List<Menu> childrens;
    @Column
    private String url;
    @Column
    private int sort;
    @Column(name = "isshow")
    private boolean isShow;
    @Column
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getChildrens() {
        return childrens;
    }

    public void setChildrens(List<Menu> childrens) {
        this.childrens = childrens;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSort() {
        return sort;
    }

    public void setSort(int sort) {
        this.sort = sort;
    }

    public boolean isShow() {
        return isShow;
    }

    public void setShow(boolean show) {
        isShow = show;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
