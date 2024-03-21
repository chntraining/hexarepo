package inter;

import static java.lang.Math.*;
//class First{
//	
//}

public class StaticEg {
	int x = 100;
	static int y = 200;
	static int z ;
	static{
		z = 500;
	}
	static{
		z = 4500;
	}
	
	static class InnerClass{
		public void innerMethod() {
			System.out.println("From Inner Method");
		}
	}
	
	
	public void regularMethod() {
		System.out.println("X : " + ++x);
		System.out.println("Y : " + ++y);
	}

	public static void staticMethod() {
		//System.out.println("X : " + x);
		//System.out.println("Y : " + y);
	}

	public static void main(String[] args) {
		StaticEg s1 = new StaticEg();
		s1.regularMethod();
		//System.out.println(s1.x);
		//System.out.println(y);
		
		
		StaticEg s2 = new StaticEg();
		s2.regularMethod();
		
		System.out.println("Z : " + z);
		
		System.out.println(PI);
		System.out.println(atan(45));
		System.out.println(sqrt(25));
		
		
		StaticEg.InnerClass obj = new StaticEg.InnerClass();
		obj.innerMethod();
		
		
		
	}

}
