package que5;

import java.util.Map;
import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("C1", "Red");
		t.put("C2", "Green");
		t.put("C3","Black");
		System.out.println(t);
		
		for(Map.Entry m: t.entrySet()){
			System.out.println(m.getKey());
		}
	}

}
