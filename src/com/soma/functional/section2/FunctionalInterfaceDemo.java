package com.soma.functional.section2;

import com.soma.functional.section3.MyFunInterface;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {

//		MyFunInterface fun = () -> System.out.println("hello");
//		fun.myMethod();
//		
//		Integer x = 100; 
		
		onTheFly(() -> System.out.println("Hello"));
		
	}
	
	
	public static void onTheFly(MyFunInterface fun) {
		fun.myMethod();
	}

}
