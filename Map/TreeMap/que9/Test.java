package que9;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("C1", "Green");
		t.put("C2", "Red");
		t.put("C3", "White");
		t.put("C4", "Black");
	System.out.println(t);
	System.out.println("Greatest Key : "+t.firstKey());
	System.out.println("Least Key : "+t.lastKey());
	

	}

}
