package que8;

import java.util.HashSet;
import java.util.TreeSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
	h.add("Red");
	h.add("White");
	h.add("Pink");
	h.add("Yellow");
	h.add("Black");
	h.add("Green");
	System.out.println("Original elements : "+h);
	TreeSet<String> t=new TreeSet<String>(h);
	for(String tempList: t){
		System.out.println(tempList);
	}
	
	
	}

}
