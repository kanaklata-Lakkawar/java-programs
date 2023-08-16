package que13;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String>str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("Pink");
		str.add("Orange");
		System.out.println("Element removed : "+str.removeFirst());
		System.out.println("Element removed : "+str.removeLast());
		System.out.println("The new LinkedList : "+str);
	}

}
