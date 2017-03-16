package com.ming.entity;

public class User {
	private String userId;
	private String phoneNum;
	private int gender;
	private int age;
	private String identityCard;
	private String photoUrl;
	private String duty;
	private String regTime;
	private String note;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public int getGender() {
		return gender;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getIdentityCard() {
		return identityCard;
	}
	public void setIdentityCard(String identityCard) {
		this.identityCard = identityCard;
	}
	
	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
	public String getPhotoUrl() {
		return photoUrl;
	}
	public void setDuty(String duty) {
		this.duty = duty;
	}
	public String getDuty() {
		return duty;
	}
	public void setRegTime(String regTime) {
		this.regTime = regTime;
	}
	public String getRegTime() {
		return regTime;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getNote() {
		return note;
	}
	public String toString() {
		return "MobileUser [userId=" + userId + ", phoneNum=" + phoneNum
				+ ", gender=" + gender + ", age=" + age + ", identityCard="
				+ identityCard + ", photoUrl=" + photoUrl + ", duty=" + duty
				+ ", regTime=" + regTime + ", note=" + note + "]";
		}
}
