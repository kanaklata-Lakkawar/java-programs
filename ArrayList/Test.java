package que8;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		System.out.println(str);
		str.sort(null);
		System.out.println(str);
	}

}
