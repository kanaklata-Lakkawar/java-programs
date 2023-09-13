package que2;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("C1", "Red");
		t.put("C2", "Green");
		t.put("C3","Black");
		t.put("C4", "White");
	t.put("C5", "Blue");
	System.out.println("Map 1 : "+t);
	
	TreeMap<String,String> t1=new TreeMap <String,String>();
	t1.put("A1", "Orange");
	t1.put("A2", "Pink");
	System.out.println("Map 2 :"+t1);
	
	t.putAll(t1);
	System.out.println("After Copying map t2 to t1 : "+t);
	}

}
