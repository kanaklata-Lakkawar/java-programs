package que18;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> t= new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(50, "White");
		t.put(60, "Pink");
		System.out.println("Value before poll : "+t);
		System.out.println("Value returned : "+t.pollLastEntry());
		System.out.println("Value before poll : "+t);
		

	}

}
