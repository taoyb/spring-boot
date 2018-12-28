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

    @Column(name = "logid")
    private int logId;
    @Column(name = "transactionamount")
    private String transactionAmount;
    @Column(name = "opttype")
    private int optType;
    @Column
    private String message;
    @Column(name = "userid")
    private String userId;
    @Column(name = "createdate")
    private Timestamp createDate;
    @Column(name = "accountorderid")
    private String accountOrderId;
    @Column(name = "tradecode")
    private String tradeCode;
    @Column(name = "trademessage")
    private String tradeMessage;
    @Column(name = "schametype")
    private String schameType;
    @Column(name = "showdate")
    private String showDate;
    @Column(name = "wallettype")
    private int walletType;
    @Column(name = "balancebefore")
    private int balanceBefore;
    @Column(name = "balanceafter")
    private int balanceAfter;
    @Column(name = "balanceenvelope")
    private int balanceEnvelope;
    @Column(name = "balanceprize")
    private int balancePrize;
    @Column(name = "balancerecharge")
    private int balanceRecharge;
    @Column(name = "balancepoint")
    private BigDecimal balancePoint;
    @Column
    private int balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getOptType() {
        return optType;
    }

    public void setOptType(int optType) {
        this.optType = optType;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    public String getAccountOrderId() {
        return accountOrderId;
    }

    public void setAccountOrderId(String accountOrderId) {
        this.accountOrderId = accountOrderId;
    }

    public String getTradeCode() {
        return tradeCode;
    }

    public void setTradeCode(String tradeCode) {
        this.tradeCode = tradeCode;
    }

    public String getTradeMessage() {
        return tradeMessage;
    }

    public void setTradeMessage(String tradeMessage) {
        this.tradeMessage = tradeMessage;
    }

    public String getSchameType() {
        return schameType;
    }

    public void setSchameType(String schameType) {
        this.schameType = schameType;
    }

    public String getShowDate() {
        return showDate;
    }

    public void setShowDate(String showDate) {
        this.showDate = showDate;
    }

    public int getWalletType() {
        return walletType;
    }

    public void setWalletType(int walletType) {
        this.walletType = walletType;
    }

    public int getBalanceBefore() {
        return balanceBefore;
    }

    public void setBalanceBefore(int balanceBefore) {
        this.balanceBefore = balanceBefore;
    }

    public int getBalanceAfter() {
        return balanceAfter;
    }

    public void setBalanceAfter(int balanceAfter) {
        this.balanceAfter = balanceAfter;
    }

    public int getBalanceEnvelope() {
        return balanceEnvelope;
    }

    public void setBalanceEnvelope(int balanceEnvelope) {
        this.balanceEnvelope = balanceEnvelope;
    }

    public int getBalancePrize() {
        return balancePrize;
    }

    public void setBalancePrize(int balancePrize) {
        this.balancePrize = balancePrize;
    }

    public int getBalanceRecharge() {
        return balanceRecharge;
    }

    public void setBalanceRecharge(int balanceRecharge) {
        this.balanceRecharge = balanceRecharge;
    }

    public BigDecimal getBalancePoint() {
        return balancePoint;
    }

    public void setBalancePoint(BigDecimal balancePoint) {
        this.balancePoint = balancePoint;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
