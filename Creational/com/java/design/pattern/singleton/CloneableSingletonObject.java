package com.java.design.pattern.singleton;

public class CloneableSingletonObject {
	public static void main(String[] args) throws CloneNotSupportedException {
		//only these type of singleton type is can not break the singleton mechanism
		Singleton s1=Singleton.instance;
		Singleton s2=(Singleton) s1.clone();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1==s2);
	}

}

class Singleton implements Cloneable{

	private Singleton() {
		super();
		
	}
	public static Singleton instance = new Singleton(); 
	
	protected Object clone() throws CloneNotSupportedException{
		 	return instance;
	}
}