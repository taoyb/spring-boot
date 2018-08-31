package com.tyb.infra.jpa;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Version;
import java.io.Serializable;
import java.sql.Timestamp;

/**
 * @Auth: tyb
 * @Date: 18-8-31 上午10:02
 * @Desc:
 */
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Id
    @Column(nullable = false, unique = true)
    private String id;

    @Version
    @Column
    @JsonIgnore
    private int ver;

    @Column
    @JsonIgnore
    private Timestamp ctime;

    @Column
    @JsonIgnore
    private Timestamp utime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getVer() {
        return ver;
    }

    public Timestamp getCtime() {
        return ctime;
    }

    public Timestamp getUtime() {
        return utime;
    }
}
