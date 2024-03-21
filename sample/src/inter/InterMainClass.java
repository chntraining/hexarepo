package inter;
interface XYZ{
	
	public void walk();
}


interface Bird extends XYZ{
	 int noofeyes = 2;

	  void fly();

}

class ABC{
	
}
class DEF{}

class Parrot extends ABC implements Bird  {

	@Override
	public void fly() {
		System.out.println("Parrot is flying");
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		
	}

}

public class InterMainClass {
	public static void main(String[] args) {

		Bird bird = new Parrot();
		bird.fly();

	}

}
