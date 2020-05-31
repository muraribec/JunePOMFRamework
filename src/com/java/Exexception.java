package com.java;

public class Exexception {

	public static void main(String[] args) {

//		try {
//			//Risky code
//			} 
//		catch (Exception e)
//		{
//		//responsible to handle the try block exception
//		}
		
		int a=10;
		try{
		System.out.println(a/0);//excp
		}
		catch(Exception ae){
			System.out.println("Dont play with divide by zero");
		}
		finally {
			System.out.println("I am in finally block");
		}
		
		
		
		
		
		
		
	}

}
