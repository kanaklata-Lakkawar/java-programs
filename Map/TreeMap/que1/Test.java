package que1;

import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(1, "Red");
		t.put(2, "Green");
		t.put(3, "Black");
		t.put(4, "White");
		t.put(5, "Blue");
		for(Map.Entry m:t.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
