package com.tyb.tybmod.prize.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Auth: tyb
 * @Date: 18-12-24 下午2:32
 * @Desc:
 */
@Entity
@Table(name = "lotteryrecord", catalog = "prize")
@DynamicInsert
@DynamicUpdate
public class LotteryRecord  implements Serializable {
    @Id
    @GenericGenerator(name="idGenerator", strategy="uuid") //这个是hibernate的注解/生成32位UUID
    @GeneratedValue(generator="idGenerator")
    private String id;

    @Column(name = "schemaid")
    private String schemaId;
    @Column(name = "userid")
    private String userId;
    @Column(name = "schematype")
    private int schemaType;
//"lotteryIcon" -> "null"
//    "userName" -> "null"
//    "realName" -> "null"
    @Column(name = "paymentstatus")
    private int paymentStatus;
    @Column(name = "lotterytype")
    private String lotteryType;
    @Column(name = "lotterytypename")
    private String lotteryTypeName;
    @Column(name = "createtime")
    private Timestamp createTime;
    @Column(name = "drawseq")
    private String drawSeq;
    @Column(name = "gametypeid")
    private String gameTypeId;
    @Column(name = "times")
    private int times;
    @Column(name = "bets")
    private int bets;
    @Column(name = "price")
    private BigDecimal price;
    @Column(name = "failureprice")
    private int failurePrice;
    @Column(name = "actualgrossprize")
    private BigDecimal actualGrossPrize;
    @Column(name = "deservegrossprize")
    private BigDecimal deserveGrossPrize;
    @Column(name = "predictprize")
    private String predictPrize;
    @Column(name = "prizestatus")
    private int prizeStatus;
    @Column(name = "orderstatus")
    private int orderStatus;
    @Column(name = "deletestatus")
    private int deleteStatus;
    @Column(name = "isprintoff")
    private int isPrintOff;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(String schemaId) {
        this.schemaId = schemaId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public int getSchemaType() {
        return schemaType;
    }

    public void setSchemaType(int schemaType) {
        this.schemaType = schemaType;
    }

    public int getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(int paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getLotteryType() {
        return lotteryType;
    }

    public void setLotteryType(String lotteryType) {
        this.lotteryType = lotteryType;
    }

    public String getLotteryTypeName() {
        return lotteryTypeName;
    }

    public void setLotteryTypeName(String lotteryTypeName) {
        this.lotteryTypeName = lotteryTypeName;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public String getDrawSeq() {
        return drawSeq;
    }

    public void setDrawSeq(String drawSeq) {
        this.drawSeq = drawSeq;
    }

    public String getGameTypeId() {
        return gameTypeId;
    }

    public void setGameTypeId(String gameTypeId) {
        this.gameTypeId = gameTypeId;
    }

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public int getBets() {
        return bets;
    }

    public void setBets(int bets) {
        this.bets = bets;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getFailurePrice() {
        return failurePrice;
    }

    public void setFailurePrice(int failurePrice) {
        this.failurePrice = failurePrice;
    }

    public BigDecimal getActualGrossPrize() {
        return actualGrossPrize;
    }

    public void setActualGrossPrize(BigDecimal actualGrossPrize) {
        this.actualGrossPrize = actualGrossPrize;
    }

    public BigDecimal getDeserveGrossPrize() {
        return deserveGrossPrize;
    }

    public void setDeserveGrossPrize(BigDecimal deserveGrossPrize) {
        this.deserveGrossPrize = deserveGrossPrize;
    }

    public String getPredictPrize() {
        return predictPrize;
    }

    public void setPredictPrize(String predictPrize) {
        this.predictPrize = predictPrize;
    }

    public int getPrizeStatus() {
        return prizeStatus;
    }

    public void setPrizeStatus(int prizeStatus) {
        this.prizeStatus = prizeStatus;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }

    public int getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(int deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public int getIsPrintOff() {
        return isPrintOff;
    }

    public void setIsPrintOff(int isPrintOff) {
        this.isPrintOff = isPrintOff;
    }
}
