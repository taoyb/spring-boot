package com.tyb.tybmod.prize.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Auth: tyb
 * @Date: 18-12-24 下午2:45
 * @Desc:
 */
//@Entity
//@Table(name = "playerrecord", catalog = "prize")
//@DynamicInsert
//@DynamicUpdate
public class PlayerRecord {



    private String schemeExpertId;
    private String schemeDescription;
    private String leagueName;
    private String predictRewards;
    private Timestamp deadline;
    private String documentaryNumber;
    private Long selfBuying;
    private BigDecimal predictReward;


}
