package _1.List;

import java.util.ArrayList;

public class Index_Of_Method_1 {

	public static void main(String[] args) {
		{
			ArrayList<String> list = new ArrayList<>(2);
			list.add("A");
			list.add("B");
			list.add("C");
			list.add("D");
			System.out.println(list);

			System.out.println(list.indexOf("A")); // true
			System.out.println(list.lastIndexOf("A"));
			System.out.println(list.indexOf("Z")); // false
		}
	}
}
