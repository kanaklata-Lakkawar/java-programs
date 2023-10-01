package que19;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(30, "Black");
		t.put(40, "White");
		t.put(50, "Pink");
		System.out.println("Original Map :"+t);

		System.out.println("SubMap Key Values : "+t.subMap(20, 40));
	}

}
