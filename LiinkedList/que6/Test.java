package que6;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String>str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		System.out.println("Original LinkedList"+str);
		str.addFirst("White");
		str.addLast("Pink");
		System.out.println("Final LinkedLList : "+str);

	}

}
