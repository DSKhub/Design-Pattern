package com.java.design.pattern.singleton;

public class LazyInitializationTest {
	public static void main(String[] args) {
		
/*		single threaded environment but when it comes to
		multithreaded systems, it can cause issues if multiple 
		threads are inside the if loop at the same time. It will 
		destroy the singleton pattern and both threads will get 
		the different instances of singleton class.
*/	
		Address a1=Address.getObj();
		Address a2=Address.getObj();
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a1==a2);
	}

}

class Address{
	private int zipCode;
	private String city;
	private String state;
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "\n Address [zipCode=" + zipCode + ", city=" + city + ", state=" + state + "]";
	}
	private Address(int zipCode, String city, String state) {
		super();
		this.zipCode = zipCode;
		this.city = city;
		this.state = state;
	}
	private Address() {
	}
	
	private static Address currentObj;
	
	public static Address getObj(){
		if(currentObj==null){
			currentObj=new Address(414304, "Nagar", "MH");
		}
		return currentObj;
	}

}
