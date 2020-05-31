package com.java;

public class Test {
	void disp(){
		System.out.println("I am in java classes");
		
	}
	void add(int a,int b){
		System.out.println("I am in addition method");
		System.out.println(a+b);
	}
	
	void add(int a,int b,int c){
		System.out.println("I am in addition of three numbers method");
		System.out.println(a+b+c);
	}
	void add(int a,int b,char ch){
		System.out.println("I am in addition of three unmatched variable method");
		System.out.println(ch);
	}
	
	
	
	public static void main(String[] args) {
		
		Test t=new Test();//Object variable/ Reference variable 
		//t.disp();
		//t.add(10,20);
		//t.add(100, 200);
		t.add(1000,2000,2);
		
		t.add(10, 20,'s');
		
		

	}

}
