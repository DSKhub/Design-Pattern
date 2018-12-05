package com.java.design.pattern.singleton;

public class SynchronizedThreadSafeTest {

	public static void main(String[] args) {
		
		
		/* it reduces the performance because of cost associated 
		 * with the synchronized method, although we need it only 
		 *  for the first few threads who might create the separate 
		 *  instances (Read: Java Synchronization). To avoid this 
		 *  extra overhead every time, double checked locking 
		 *  principle is used. 
		 */
		
		Employee e1=Employee.getObj();
		Employee e2=Employee.getObj();
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e1==e2);
	}
}

class Employee{
	private int empID;
	private String empName;
	private String empAddress;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empAddress=" + empAddress + "]";
	}
	private Employee(int empID, String empName, String empAddress) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empAddress = empAddress;
	}
	private Employee() {
	}
	
	private static Employee instance;
	
	public static synchronized Employee getObj(){
		if(instance==null){
			instance=new Employee(1, "DSK", "Pune");
		}
		
		return instance;
	}
	
}
