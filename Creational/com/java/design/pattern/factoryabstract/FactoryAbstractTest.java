package com.java.design.pattern.factoryabstract;

public class FactoryAbstractTest {

	public static void main(String[] args) {
	Organisation emp=OrganisationFactory.getOrgnisation(101, "DSK", 12000, factoryType.EMPLOYEE);
	Organisation manager=OrganisationFactory.getOrgnisation(110, "Rupali", 15000, factoryType.MANAGER);
	
	System.out.println("Employee:"+emp);
	System.out.println("Manager:"+manager);
	}
}

