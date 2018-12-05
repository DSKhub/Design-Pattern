package com.java.design.pattern.prototype;

public class Customer implements Cloneable {

	private int custID;
	private String custName;
	private Address custAdd;

	public int getCustID() {
		return custID;
	}

	public void setCustID(int custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public Address getCustAdd() {
		return custAdd;
	}

	public void setCustAdd(Address custAdd) {
		this.custAdd = custAdd;
	}
     
	
	
	public Customer(int custID, String custName, Address custAdd) {
		super();
		this.custID = custID;
		this.custName = custName;
		this.custAdd = custAdd;
	}

	@Override
	public String toString() {
		return "Customer [custID=" + custID + ", custName=" + custName + ", custAdd=" + custAdd + "]";
	}

	@Override
	protected Customer clone() throws CloneNotSupportedException {

		return (Customer) super.clone();
	}

}

class Address {
	private int pinCode;
	private String city;

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", city=" + city + "]";
	}

	public Address(int pinCode, String city) {
		super();
		this.pinCode = pinCode;
		this.city = city;
	}

}