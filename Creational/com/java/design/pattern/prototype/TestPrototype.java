package com.java.design.pattern.prototype;

public class TestPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address a1=new Address(1234, "Pune");
		Customer c1=new Customer(101, "DSK", a1);
		Customer c2=new Customer(102, "Sai", a1);
		Customer c3=(Customer) c2.clone();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		
		System.out.println(c1==c2);
		System.out.println(c1==c3);
		System.out.println(c2==c1);
		System.out.println(c2==c3);
		System.out.println(c3==c1);
		System.out.println(c3==c2);
	}

}
