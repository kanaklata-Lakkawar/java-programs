package que11;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(10, "Red");
		t.put(20, "Green");
		t.put(40, "Black");
		t.put(50, "White");
		t.put(60, "Pink");
		System.out.println(t);
		
		System.out.println("Checking the entry for : 10");
	    System.out.println("Value is : :"+t.floorEntry(10));	
	    System.out.println("Checking the entry for : 30");
	    System.out.println("Value is : "+t.floorEntry(30));
	    System.out.println("Checking the entry for : 70");
	    System.out.println("Value is : "+t.floorEntry(70));	
		
	}

}
