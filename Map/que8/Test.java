package que8;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		h.put(1,"Red");
		h.put(2,"Green");
		h.put(3,"Black");
		h.put(4,"White");
		h.put(5,"Blue");
		System.out.println(h);
		System.out.println("Is key Green exist ?");
		if(h.containsValue("Green"))
		System.out.println("Yes!");
		else
			System.out.println("No!");
		System.out.println("Is key Orange exist ?");
		if(h.containsValue("Orange"))
			System.out.println("Yes!");
			else
				System.out.println("No!");
	

	}

}
