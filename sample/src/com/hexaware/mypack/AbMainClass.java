package com.hexaware.mypack;

abstract class Bird{
	 int nooflegs;
	 int noofeyes= 2;
	
	 Bird(){
		 System.out.println("Bird Constructor...");
	 }
	 public abstract void fly();
	
	 public void eat() {
		 System.out.println("Bird eating...");
	 }
}
class Parrot extends Bird {

	@Override
	public void fly(){
		System.out.println("Parrot is flying");
	}
	
}

public class AbMainClass {

	public static void main(String[] args) {
		Bird bird = new Parrot();
		bird.fly();

	}

}
