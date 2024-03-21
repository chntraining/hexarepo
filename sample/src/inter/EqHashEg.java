package inter;

public class EqHashEg {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setEmpno(100);
		e2.setEmpno(100);

		System.out.println(e1.equals(e2));	

	}
	
	
	

}
