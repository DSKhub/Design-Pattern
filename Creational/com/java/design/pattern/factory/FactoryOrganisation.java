package com.java.design.pattern.factory;

public class FactoryOrganisation {
	public static AbstractOrganisation getOrgnisation(int eid,String name,float sal,factoryType type){
		if (factoryType.EMPLOYEE.toString().equals(type.toString())) {
			return new Employee(eid, name, sal);
		}
		else if (factoryType.MANAGER.toString().equals(type.toString())) {
			return new Manager(eid, name, sal);
		}
		
		return null;
		
	}

}

enum factoryType{
	EMPLOYEE,
	MANAGER;
	
}