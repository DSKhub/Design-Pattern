package com.java.design.pattern.builder;

import com.java.design.pattern.builder.OuterClass.InnerClass;

public class BuilderTest {

	public static void main(String[] args) {
		OuterClass out1=new OuterClass.InnerClass(101, "OuterName1", "outerAddress1").build();
		OuterClass out2=new OuterClass.InnerClass(102, "OuterName2", "outerAddress1").setOptionId(111).setOptionName("optionName").build();
		System.out.println(""+out1);
		System.out.println(""+out2);
	}

}
 