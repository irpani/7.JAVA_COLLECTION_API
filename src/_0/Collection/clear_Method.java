package _0.Collection;

import java.util.ArrayList;
import java.util.List;

public class clear_Method {

	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(Integer.valueOf(2));
		li.add(3);
		System.out.println(li);
		li.add(0, 90);
		int i = 10;
		if (li.size() < 10) {
			i = li.size();
			li.add(i, 900);
			System.out.println(li);
		}

		ArrayList<Integer> li1 = new ArrayList<Integer>();

		ArrayList<String> list = new ArrayList<>();
		list.add("Test1");
		list.add("Test2");
		list.add("Test3");
		list.add("Test4");
		list.add("Test5");

		System.out.println(list);
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Test11");
		list1.add("Test21");

		list.addAll(list1);
		list.addAll(5, list1);
		System.out.println(list);

		list.clear();
		System.out.println(list);
	}
}
