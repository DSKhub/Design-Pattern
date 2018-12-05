package com.java.design.pattern.factoryabstract;

public class EmployeeFactory {

	public int empID;
	public String empName;
	public float empSalary;
	public EmployeeFactory(int empID, String empName, float empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	public Organisation createOrganisation(){
		return new EmployeeChild(empID, empName, empSalary);
		
	}
	
}
