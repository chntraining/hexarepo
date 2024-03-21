package inter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionEg {

	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Hari");
		list.add(new Integer(1)); //  Boxing
		list.add(2.3); // Auto Boxing
		//list.add(true);
		//list.add('c');
		list.add("Hari");
		list.add("Priya");
		list.add(null);
		list.add(null);
		System.out.println(list);
		System.out.println("List size " + list.size());
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set set = new HashSet<>();
		set.add("Hari");
		set.add(1);
		set.add(2.3);
		set.add(true);
		set.add('c');
		set.add("Hari");
		set.add("Priya");
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println("Set size " + set.size());

		Iterator itt = set.iterator();
		while(itt.hasNext()) {
			System.out.println(itt.next());
		}
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Hari");
		//map.put(2,1);
		//map.put(3,2.3);
		//map.put(4,true);
		//map.put(5,'c');
		map.put(6,"Hari");
		map.put(7,"Priya");
		map.put(7,"Shiva");
		map.put(8,null);
		map.put(null, "Zero");
		map.put(9,"Charan");
		System.out.println(map);
		
		Collection c	= map.values();
		
		Iterator mi = c.iterator();
		Set keysets = 	map.keySet();
		System.out.println(keysets);
		while(mi.hasNext()) {
			System.out.println(mi.next());
		}
		System.out.println("maps ize " + map.size());
		
		
		Set eset =map.entrySet();
		System.out.println(eset);
		
		System.out.println(map.isEmpty());
	}

}




