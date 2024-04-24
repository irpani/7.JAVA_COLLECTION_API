package _0.Collection;

import java.util.ArrayList;
import java.util.List;

public class Add_Addall_Method {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		/***
		 * add() addAll() ---- Behave Like Union
		 * 
		 * remove() removerAll()
		 * 
		 * retainAll() ----- Behave Like Intersection
		 * 
		 * contains() containsAll() ----- Behaves like Subset
		 * 
		 * isEmpty() size() clear()
		 * 
		 */
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");

		ArrayList<String> list1 = new ArrayList<>();

		list1.add("E");
		list1.add("F");
		list1.add("G");
		list1.add("H");
		list1.add("B");

		list.addAll(list1);
		System.out.println(list);
		// list.remove(2);
		// list.removeAll(list1);
		System.out.println(list.retainAll(list1));
		System.out.println(list.size());
		list.clear();
		System.out.println(list);
		System.out.println(list.isEmpty());
	}
}
