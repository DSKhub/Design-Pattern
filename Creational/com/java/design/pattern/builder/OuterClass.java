package com.java.design.pattern.builder;

public class OuterClass { 
	private int outerID;
	private String outerName;
	private String outerAddress;
	
	private int optionId;
	private String optionName;
		
	private OuterClass(InnerClass inner) {
		super();
		this.outerID = inner.outerID;
		this.outerName = inner.outerName;
		this.outerAddress = inner.outerAddress;
		this.optionId = inner.optionId;
		this.optionName =inner. optionName;
	}
	

	public int getOuterID() {
		return outerID;
	}
	public String getOuterName() {
		return outerName;
	}
	public String getOuterAddress() {
		return outerAddress;
	}
	public int getOptionId() {
		return optionId;
	}
	public String getOptionName() {
		return optionName;
	}

	
	@Override
	public String toString() {
		return "\n OuterClass [outerID=" + outerID + ", outerName=" + outerName + ", outerAddress=" + outerAddress
				+ ", optionId=" + optionId + ", optionName=" + optionName + "]";
	}


	static class InnerClass{
		private int outerID;
		private String outerName;
		private String outerAddress;
		private int optionId;
		private String optionName;
		public InnerClass(int outerID, String outerName, String outerAddress) {
			this.outerID = outerID;
			this.outerName = outerName;
			this.outerAddress = outerAddress;
		}
		public InnerClass setOptionId(int optionId) {
			this.optionId = optionId;
			return this;
			
		}
		public InnerClass setOptionName(String optionName) {
			this.optionName = optionName;
			return this;
		}
		
     public OuterClass build(){
    	 return new OuterClass(this);
     }		
	
	}
}
