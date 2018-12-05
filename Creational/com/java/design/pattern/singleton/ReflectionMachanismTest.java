package com.java.design.pattern.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionMachanismTest {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Customer c1=Customer.getObject();
		Customer c2=null;
		try {
            // Below code will change constructor access level from private to public
            Constructor constructor = Customer.class.getDeclaredConstructor();
            constructor.setAccessible(true);
             
            // Creating second instance
            c2 = (Customer) constructor.newInstance();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("instanceOne HashCode : " + c1.hashCode());
        System.out.println("instanceTwo HashCode : " + c2.hashCode());
		System.out.println(c1==c2);
	}

}

class Product{
	private int pId;
	private String pName;
	private String pAddress;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	@Override
	public String toString() {
		return "Product [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}
	private Product(int pId, String pName, String pAddress) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAddress = pAddress;
	}
	private Product() {
		
	}
	
	
}
