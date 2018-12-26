package com.tyb.tybmod.prize.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * @Auth: tyb
 * @Date: 18-12-24 下午2:32
 * @Desc:
 */
//@Entity
//@Table(name = "lotteryrecord", catalog = "prize")
//@DynamicInsert
//@DynamicUpdate
public class LotteryRecord {

    private int logId;
    private String transactionAmount;
    private int optType;
    private String message;
    private String userId;
    private Timestamp createDate;
    private String accountOrderId;
    private String tradeCode;
    private String tradeMessage;
    private String schameType;
    private String showDate;
    private int walletType;
    private int balanceBefore;
    private int balanceAfter;
    private int balanceEnvelope;
    private int balancePrize;
    private int balanceRecharge;
    private BigDecimal balancePoint;
    private int balance;

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
