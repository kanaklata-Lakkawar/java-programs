package que21;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("White");
		str.add("Pink");
		System.out.println("First element in the LinkedList : "+str);
		System.out.println("Last element in the LinkedList : "+str.getLast());
		System.out.println("Original LinkedList : "+str);

	}

}
