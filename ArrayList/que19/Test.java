package que19;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList <String> str=new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("White");
		str.add("Pink");
		System.out.println("Original arrayList : "+str);
		str.trimToSize();
        System.out.println("Let trim to size the above array : "+str);
	}

}
