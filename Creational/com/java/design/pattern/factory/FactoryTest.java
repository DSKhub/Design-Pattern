package com.java.design.pattern.factory;

public class FactoryTest {

	public static void main(String[] args) {
	AbstractOrganisation emp=FactoryOrganisation.getOrgnisation(101, "DSK", 12000, factoryType.EMPLOYEE);
	AbstractOrganisation manager=FactoryOrganisation.getOrgnisation(110, "Rupali", 15000, factoryType.MANAGER);
	
	System.out.println("Employee:"+emp);
	System.out.println("Manager:"+manager);
	}
}

