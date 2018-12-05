package com.java.design.pattern.factoryabstract;

public class ManagerFactory {
	public int empID;
	public String empName;
	public float empSalary;
	public ManagerFactory(int empID, String empName, float empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	
	public Organisation createOrganisation(){
		return new ManagerParent(empID, empName, empSalary);
		
	}

}
