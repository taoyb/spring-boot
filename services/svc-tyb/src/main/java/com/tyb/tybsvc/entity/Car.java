package com.tyb.tybsvc.entity;

import com.tyb.infra.jpa.BaseEntity;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Auth: tyb
 * @Date: 18-8-31 下午4:04
 * @Desc:
 */
@Entity
@Table(name = "car",catalog = "tybweb")
@DynamicInsert
@DynamicUpdate
public class Car extends BaseEntity {

    @Column
    private String name;
    @Column
    private String url;
    @Column
    private int sequence;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getSequence() {
        return sequence;
    }

    public void setSequence(int sequence) {
        this.sequence = sequence;
    }
}
