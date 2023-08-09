package que7;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String>str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		System.out.println(str);
		str.addFirst("Pink");
		System.out.println(str);

	}

}
