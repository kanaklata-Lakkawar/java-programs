package que6;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("C1", "Red");
		t.put("C2", "Green");
		t.put("C3", "Black");
		t.put("C4", "White");
		System.out.println("TreeMap content : "+t);

		t.clear();
		System.out.println("New Treemap : "+t);
	}

}
