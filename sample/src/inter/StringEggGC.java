package inter;


public class StringEggGC {

	public static void main(String[] args) {

		for (;;) {
			String str = new String("Hi");
			System.out.println(str);
		}

	}

}
