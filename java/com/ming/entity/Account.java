package com.ming.entity;

import java.util.Date;

public class Account {
	private String userAcctCode;
	private String userId;
	private String yyyyMM;
	private double suitFee;
	private double talkFee;
	private double roamingFee;
	private double iLongFee;
	private double iRoamingFee;
	private double total;
	private int payedFlag;
	private Date payTime;

	public void setUserAcctCode(String userAcctCode) {
		this.userAcctCode = userAcctCode;
	}
	public String getUserAcctCode() {
		return userAcctCode;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserId() {
		return userId;
	}
	public void setYyyyMM(String yyyyMM) {
		this.yyyyMM = yyyyMM;
	}
	public String getYyyyMM() {
		return yyyyMM;
	}
	public void setSuitFee(double suitFee) {
		this.suitFee = suitFee;
	}
	public double getSuitFee() {
		return suitFee;
	}
	public void setTalkFee(double talkFee) {
		this.talkFee = talkFee;
	}
	public double getTalkFee() {
		return talkFee;
	}
	public void setRoamingFee(double roamingFee) {
		this.roamingFee = roamingFee;
	}
	public double getRoamingFee() {
		return roamingFee;
	}
	public void setiLongFee(double iLongFee) {
		this.iLongFee = iLongFee;
	}
	public double getiLongFee() {
		return iLongFee;
	}
	public void setiRoamingFee(double iRoamingFee) {
		this.iRoamingFee = iRoamingFee;
	}
	public double getiRoamingFee() {
		return iRoamingFee;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public double getTotal() {
		return total;
	}
	public void setPayedFlag(int payedFlag) {
		this.payedFlag = payedFlag;
	}
	public int getPayedFlag() {
		return payedFlag;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public String toString() {
		return "Account [userAcctCode=" + userAcctCode + ", userId=" + userId + ", yyyyMM=" + yyyyMM
				+ ", suitFee=" + suitFee + ", talkFee=" + talkFee + ", roamingFee=" + roamingFee + ", iLongFee="
				+ iLongFee + ", iRoamingFee=" + iRoamingFee + ", total=" + total + ", payedFlag=" + payedFlag
				+ ", payTime=" + payTime + "]";
	}
}
