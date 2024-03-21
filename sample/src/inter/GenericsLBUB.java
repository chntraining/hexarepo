package inter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericsLBUB {
	//Integer is LowerBound
	public static void addNumbersToList(List<? super Integer> list) {
		for(int i=1;i<=10;i++) {
			list.add(i);
		}
		System.out.println(list);
	}
	//Integer is UpperBound
	public static void sumofallNumber(List<? extends Number> list) {
		double d =0;
		for(Number n : list) {
		   d=d+ n.doubleValue();
		}
		System.out.println(d);
	}

	public static void main(String[] args) {
		List<Object> list1 = new ArrayList<Object>();
		addNumbersToList(list1);
		List<Number> list2 = new ArrayList<Number>();
		addNumbersToList(list2);
		List<Integer> list5 = new ArrayList<Integer>();
		addNumbersToList(list5);
		
		List<Double> list3 = new ArrayList<>();
		list3.add(5.2);
		list3.add(1.2);
		list3.add(1.4);
		list3.add(2.3);
		list3.add(5.6);
		sumofallNumber(list3);
		
		List<Integer> list4 = Arrays.asList(1,2,3,4,5);
		sumofallNumber(list4);

	}

}
