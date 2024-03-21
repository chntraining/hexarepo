package com.hexaware.mypack;
@FunctionalInterface
interface Calculate {
	//public int add(int a, int b);
	public void add(int a,int b);
	
	public default void display() { //Default method
		System.out.println("Displaying....");
	}
	
	public static void displayNum() { //Default method
		System.out.println("Displaying 10000....");
	}
}

public class LamdaEg {
	
	public static void main(String[] args) {
		//Calculate  result =(a, b) -> {  return a + b; };
		Calculate  result =(a, b) -> System.out.println(a+b);
		result.add(14, 6);
		
		result.display();
		Calculate.displayNum();
	}
	
}

/*
public class LamdaEg implements Calculate {
	public static void main(String[] args) {
		LamdaEg le = new LamdaEg();
		System.out.println(le.add(45, 5));
	}

	@Override
	public int add(int a, int b) {
		return a + b;
	}

}
*/