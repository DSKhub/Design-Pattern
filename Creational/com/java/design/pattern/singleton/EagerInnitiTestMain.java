package com.java.design.pattern.singleton;

public class EagerInnitiTestMain {
	
    public static void main(String[] args) {
    	// 1.
    //drawbacks of eager loading is that if you don't required the object still creted the object
		Customer c1=Customer.getObject();
		Customer c2=Customer.getObject();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c1==c2);
	}
	
}

class Customer{
	private int custId;
	private String custName;
	private String address;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "\n Customer [custId=" + custId + ", custName=" + custName + ", address=" + address + "]";
	}
	private Customer(int custId, String custName, String address) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.address = address;
	}
	private Customer() {
		
	}
	
	private static Customer instance=new Customer(1, "DSK", "Pune");
	
	public static Customer getObject(){
		return instance;
	}
	
	
}