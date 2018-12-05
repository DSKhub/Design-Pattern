package com.java.design.pattern.singleton;

public class StaticBlockTestMain {

	public static void main(String[] args) {
		//2.
		//success scenario
		System.out.println("Work as Singleton");
		Person p1=Person.getObj();
		Person p2=Person.getObj();
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p1==p2);
		
		
		//false scenario
		System.out.println("Break the Singleton object features..");
		Person p11=Person.getObj();
		Person p12=Person.getObj2();
		System.out.println(p11);
		System.out.println(p12);
		System.out.println(p11==p12);
		
	}
}

class Person{
	private int id;
	private String name;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "\n Person [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	//create private constructor
	private Person(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	//one singleton obj cretaion line no 64 to 77  is recommended
	private Person() {
		
	}
	
	private static Person obj1;
	
	static{
		try {
			obj1=new Person(1, "DSK","Pune");
		} catch (Exception e) {
			throw new RuntimeException("Exception...singleton obj 1..");
		}
	}public static Person getObj(){
		return obj1;
	}
	
	
	//below code is only for how to break the singleton features r break
	private static Person obj2;
	static{
		obj2=new Person(2, "Sai","Nagar");
	}
	public static Person getObj2(){
		return obj2;
	}
	
	
}
