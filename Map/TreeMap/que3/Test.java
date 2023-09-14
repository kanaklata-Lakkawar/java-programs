package que3;

import java.util.TreeMap;

public class Test {

	public static void main(String[] args) {
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("C1", "Red");
		t.put("C2", "Green");
		t.put("C3", "Black");
		t.put("C4", "White");
		System.out.println(t);
		
		if(t.containsKey("C1"))
		System.out.println("The TreeMap contains Key C1");
		else
		System.out.println("The TreeMap contains Key C1");
		
		if(t.containsKey("C5"))
		System.out.println("The TreeMap contains Key C5");
		else
		System.out.println("The TreeMap contains Key C5");
		
	}

}
