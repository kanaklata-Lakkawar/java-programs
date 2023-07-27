package que18;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList <String> str=new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("white");
		str.add("Pink");
		System.out.println(str);
		System.out.println("Checking the above arrayList is empty or not : "+str.isEmpty());
		str.removeAll(str);
		System.out.println("Checking the above arrayList is empty or not : "+str.isEmpty());

	}

}
