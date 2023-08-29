package que11;

import java.util.Collection;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
		h.add("Red");
		h.add("White");
		h.add("Black");
		h.add("Green");
		System.out.println(h);
		
		HashSet<String>h1=new HashSet<String>();
		h1.add("Red");
		h1.add("Pink");
		h1.add("Black");
		h1.add("Orange");
		System.out.println(h1);
		
		if(h.retainAll(h1))
			System.out.println(h);
		
	}

}
