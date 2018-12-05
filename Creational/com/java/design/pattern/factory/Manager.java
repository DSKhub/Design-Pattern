package com.java.design.pattern.factory;

public class Manager extends AbstractOrganisation {
	
	
	public Manager(int empID, String empName, float empSalary) {
		super(empID, empName, empSalary);
		
	}

	@Override
	public String toString() {
		return "Manager [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]";
	}

	@Override
	public String getTemporaryEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPermanentEmp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getThirdPartyEmp() {
		// TODO Auto-generated method stub
		return null;
	}

}
