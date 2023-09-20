package que7;

import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("C1", "Red");
		t.put("C2", "Green");
		t.put("C3", "Black");
		t.put("C4", "White");
		System.out.println(t);
		t.comparator();
		System.out.println(t);

	}

}
