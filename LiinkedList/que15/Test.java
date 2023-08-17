package que15;

import java.util.Collections;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String>str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("Pink");
		str.add("Orange");
		System.out.println("Original LinkedList : "+str);
		Collections.swap(str, 0, 2);
		System.out.println("New LinkedList : "+str);
	}

}
