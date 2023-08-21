package que25;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String>str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("BLack");
		str.add("White");
		str.add("Pink");
		System.out.println(str);
		System.out.println(str.isEmpty());
		str.removeAll(str);
		System.out.println(str.isEmpty());

	}

}
