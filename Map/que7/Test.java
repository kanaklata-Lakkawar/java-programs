package que7;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		HashMap<String,Integer> h=new HashMap<String,Integer>();
		h.put("Red",1);
		h.put("Green",2);
		h.put("Black",3);
		h.put("White",4);
		h.put("Blue",5);
		System.out.println(h);
		System.out.println("Is key Green exist ?");
		if(h.containsKey("Green"))
		System.out.println("Yes!");
		else
			System.out.println("No!");
		System.out.println("Is key Orange exist ?");
		if(h.containsKey("Orange"))
			System.out.println("Yes!");
			else
				System.out.println("No!");
	

	}

}
