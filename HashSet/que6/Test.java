package que6;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String>h=new HashSet<String>();
		h.add("Red");
		h.add("White");
		h.add("Pink");
		h.add("Yellow");
		h.add("Black");
		h.add("Green");
		System.out.println("Original HashSet : "+h);
		HashSet <String>h1=new HashSet<String>();
		h1=(HashSet)h.clone();
		System.out.println("Cloned HashSet : "+h1);
		
		
	}

}
