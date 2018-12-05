package com.java.design.pattern.singleton;

public class BillPughSingletonTest {
	public static void main(String[] args) {
/*the private inner static class that contains the instance of the 
 * singleton class. When the singleton class is loaded
 * 
 *BankHelperInnerClass class is not loaded into memory and only when someone calls the 
 * getInstance method, this class gets loaded and creates the 
 * Singleton class instance.
  */
		Bank b1=Bank.getInstance();
		Bank b2=Bank.getInstance();
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b1==b2);
	}

}

class Bank{
	private int ifscCode;
	private String bankName;
	private String bankAddress;
	public int getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(int ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}
	@Override
	public String toString() {
		return "Bank [ifscCode=" + ifscCode + ", bankName=" + bankName + ", bankAddress=" + bankAddress + "]";
	}
	private Bank(int ifscCode, String bankName, String bankAddress) {
		super();
		this.ifscCode = ifscCode;
		this.bankName = bankName;
		this.bankAddress = bankAddress;
	}
	private Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// the private inner static class that contains the instance of 
	//the singleton class. When the singleton class is loaded
	
	private static class BankHelperInnerClass{
		private static final Bank bankObj=new Bank(12345, "SBI", "Pune");
	}
	
	public static Bank getInstance(){
		return BankHelperInnerClass.bankObj;
	}
}