package _5.Stack;

import java.util.Stack;

public class Example1 {

	/****
	 * Stack LIFO Process => [ Last In First Out ] push() pop() peek() isEmpty()
	 * Search()
	 * 
	 */

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<Integer>();

		System.out.println(stack.empty());

		// Exception in thread "main" java.util.EmptyStackException
		// System.out.println(stack.peek());

		// Exception in thread "main" java.util.EmptyStackException
		// System.out.println(stack.pop());

		System.out.println(stack.push(80));
		System.out.println(stack.push(70));
		System.out.println(stack.push(60));
		System.out.println(stack.push(10));
		System.out.println(stack);
		System.out.println("------------");

		System.out.println(stack.peek());
		System.out.println(stack);

		System.out.println("------------");
		System.out.println(stack.pop());
		System.out.println(stack);

		System.out.println("------------");
		System.out.println(stack.indexOf(60));
		System.out.println(stack);

		System.out.println(stack.empty());
		System.out.println(stack.search(10));

	}

}
