package com.java.design.pattern.factoryabstract;

public abstract class Organisation {
	
	public int empID;
	public String empName;
	public float empSalary;
	
	public abstract String getTemporaryEmp();
	public abstract String getPermanentEmp();
	public abstract String getThirdPartyEmp();
	
	public Organisation(int empID, String empName, float empSalary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empSalary = empSalary;
	}
	@Override
	public String toString() {
		return "AbstractOrganisation [getTemporaryEmp()=" + getTemporaryEmp() + ", getPermanentEmp()="
				+ getPermanentEmp() + ", getThirdPartyEmp()=" + getThirdPartyEmp() + "]";
	}
	
	
	
   	

}
