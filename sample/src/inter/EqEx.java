package inter;

import java.util.Objects;

public class EqEx {
	String s1 = "hello";
	String s2 = new String("hello");
	
	@Override
	public int hashCode() {
		return Objects.hash(s1, s2);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqEx other = (EqEx) obj;
		return Objects.equals(s1, other.s1) && Objects.equals(s2, other.s2);
	}
	
	public boolean compareMyStr() {
		System.out.println(s1==s2);
		return s1.equals(s2);
	}
	

	public static void main(String[] args) {
		
		EqEx e = new EqEx();
		System.out.println(e.compareMyStr());
		System.out.println(e.s1.equals(e.s2));
		System.out.println(e.s1.hashCode());
		System.out.println(e.s2.hashCode());
		System.out.println(e.hashCode());
	}

}
