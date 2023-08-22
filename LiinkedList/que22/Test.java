package que22;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String>str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("White");
		str.add("Pink");
		System.out.println("Original LinkedList : "+str);
		if(str.contains("Green"))
		System.out.println("Color Green is present in the List");
		else System.out.println("Color Green is not present in the List");
		if(str.contains("Orange"))
		System.out.println("Color Orange is present in the List");
		else System.out.println("Color Orange is not present in the List");
	}

}
