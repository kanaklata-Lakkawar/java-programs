package que17;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("White");
		str.add("Pink");
		System.out.println("List of first LinkedList : "+str);
		LinkedList <String>str1=new LinkedList<String>();
	    str1.add("Red");
	    str1.add("Green");
	    str1.add("Black");
	    str1.add("Pink");
	    System.out.println("List of second LinkedList : "+str1);
	str.addAll(str1);
	System.out.println("New LinkedList : "+str);
	}

}
