package que19;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("White");
		str.add("Pink");
		System.out.println("Original LinkedList : "+str);
		System.out.println("Removed element : "+str.removeFirst());
		System.out.println("Linked List after pop operation : "+str);
	}

}
