package com.tyb.tybmod.prize.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @Auth: tyb
 * @Date: 18-12-24 下午2:24
 * @Desc:
 */
//@Entity
//@Table(name = "gameplayer", catalog = "prize")
//@DynamicInsert
//@DynamicUpdate
public class GamePlayer {

    @Column(name = "expertid")
    private String expertId;
    @Column(name = "nickname")
    private String nickName;//昵称
    @Column(name = "sevendaysprofit")
    private String sevenDaysProfit;//七日利润
    @Column(name = "hitsituation")
    private String hitSituation;
    @Column(name = "fanscount")
    private String fansCount;//粉丝

    public String getExpertId() {
        return expertId;
    }

    public void setExpertId(String expertId) {
        this.expertId = expertId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getSevenDaysProfit() {
        return sevenDaysProfit;
    }

    public void setSevenDaysProfit(String sevenDaysProfit) {
        this.sevenDaysProfit = sevenDaysProfit;
    }

    public String getHitSituation() {
        return hitSituation;
    }

    public void setHitSituation(String hitSituation) {
        this.hitSituation = hitSituation;
    }

    public String getFansCount() {
        return fansCount;
    }

    public void setFansCount(String fansCount) {
        this.fansCount = fansCount;
    }
}
