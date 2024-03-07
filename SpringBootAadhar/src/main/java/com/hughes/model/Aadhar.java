package com.hughes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Aadhar {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="aadhar_num")
	private long aadharNum;
	@Column(name="name")
	private String name;
	@Column(name="mobileNum")
	private long mobileNum;
	@Column(name="address")
	private String address;
	@Column(name="income")
	private int income;
	@Column(name="state")
	private String state;
	
	public long getAadharNum() {
		return aadharNum;
	}
	public void setAadharNum(long aadharNum) {
		this.aadharNum = aadharNum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobileNum() {
		return mobileNum;
	}
	public void setMobileNum(long mobileNum) {
		this.mobileNum = mobileNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
