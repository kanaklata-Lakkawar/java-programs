package que6;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "Red");
		h.put(2, "Green");
		h.put(3, "Black");
		h.put(4, "White");
		h.put(5, "Blue");
		System.out.println("Original Map: "+h);
		
		HashMap<Integer,String> h1=new HashMap<Integer,String>();
		h1=(HashMap)h.clone();
		System.out.println("Cloned Map : "+h1);
	}

}
