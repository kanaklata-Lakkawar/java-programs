package que3;

import java.util.HashMap;

public class Test {

	public static void main(String args[]){
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1, "Red");
		h.put(2, "Green");
		h.put(3, "Black");
		System.out.println(h);
        HashMap<Integer,String> h1=new HashMap<Integer,String>();
        h1.put(4, "White");
        h1.put(5, "Blue");
        h1.put(6, "Orange");
        System.out.println(h1);
        h1.putAll(h);
       System.out.println(h1);
        
	}
}
