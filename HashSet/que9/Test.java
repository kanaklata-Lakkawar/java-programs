package que9;

import java.util.ArrayList;
import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
	h.add("Red");
	h.add("White");
	h.add("Pink");
	h.add("Yellow");
	h.add("Black");
	h.add("Green");
	System.out.println("original HashSet : "+h);
	
	ArrayList<String> str=new ArrayList<String>(h);
	System.out.println("ArrayList contains : "+str);
	}

}
