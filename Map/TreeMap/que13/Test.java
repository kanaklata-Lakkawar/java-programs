package que13;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(30, "Black");
		t.put(50, "White");
		t.put(60, "Pink");
		
		System.out.println(t);
		System.out.println("Checking entry for 10 : ");
		System.out.println("Key(s) : "+t.ceilingEntry(10));
		System.out.println("Checking entry for 20 : ");
		System.out.println("Key(s) : "+t.ceilingEntry(20));
		System.out.println("Checking entry for 70 : ");
		System.out.println("Key(s) : "+t.ceilingEntry(70));
		
	}

}
