package que10;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("C1", "Green");
		t.put("C2", "Red");
		t.put("C3", "White");
		t.put("C4", "Black");
		System.out.println(t);
		
		System.out.println("Reverse order view of the keys : "+t.descendingKeySet());

	}

}
