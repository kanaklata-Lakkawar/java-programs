package que1;

import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<Integer,String>h=new HashMap<Integer,String>();
		h.put(1, "Red");
		h.put(2,"Green");
		h.put(3, "Black");
		h.put(4, "White");
		h.put(5, "Blue");
		
	
		System.out.println(h);
		for(Map.Entry m:h.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
	}

}
