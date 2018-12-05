package com.java.design.pattern.factoryabstract;

import com.java.design.pattern.factory.AbstractOrganisation;
import com.java.design.pattern.factory.Employee;
import com.java.design.pattern.factory.Manager;

public class OrganisationFactory {
	//public static Organisation getOrganisation()

	
	public static Organisation getOrgnisation(int eid,String name,float sal,factoryType type){
		if (factoryType.EMPLOYEE.toString().equals(type.toString())) {
			return new EmployeeChild(eid, name, sal);
		}
		else if (factoryType.MANAGER.toString().equals(type.toString())) {
			return new ManagerParent(eid, name, sal);
		}
		
		return null;
		
	}

}

enum factoryType{
	EMPLOYEE,
	MANAGER;
	
}
