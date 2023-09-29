package que16;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap <Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(50, "White");
		t.put(60, "PInk");
		System.out.println(t);
		
		System.out.println("Original TreeMap content : "+t.keySet());
		
				}

}
