package com.learnjava.first;

public class BlockExecution {
	
	//creation of static block
	//runs or execute before main method
	//it will run even if there is no instance in main method
	//runs only one time
	static {
		System.out.println("Inside static block");
	}
	
	//creation of non-static block
	//runs everytime an instance  object is created for class
	{
		System.out.println("Inside non-static block");
	}
	
	
	public static void main(String[] args) {
		BlockExecution ex1 = new BlockExecution();
		BlockExecution ex2 =new BlockExecution();
	}
	
	/*
	 * output 
	 * Inside static block
       Inside non-static block  //since we have two object reference it wil run the non-static block twice 
       Inside non-static block
	 */

}
