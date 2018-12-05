package com.java.design.pattern.singleton;

public class EnumSingletonTest {

	public static void main(String[] args) {
		System.out.println(SingletonEnum.OBJECT);
	}
	enum SingletonEnum{
	    OBJECT;
	   private SingletonEnum()
	    {
	        System.out.println("SingletonEnum Constructor ");
	    }
	}
	
}

