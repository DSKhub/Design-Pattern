package com.java.design.pattern.factory;

public class Employee extends AbstractOrganisation {

	public Employee(int empID, String empName, float empSalary) {
		super(empID, empName, empSalary);
		
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empSalary=" + empSalary + "]";
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
