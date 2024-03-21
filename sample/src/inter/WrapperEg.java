package inter;

public class WrapperEg {

	public static void main(String[] args) {
		int x=100;
		Integer inte = new Integer(x);
		
		Integer i  = x;
		System.out.println(i   * 2);
		System.out.println(x);
		System.out.println(i.intValue() * 2);
		
		
		String num = "500";
		System.out.println(Integer.parseInt(num) + 20);
		
		
	}

}
