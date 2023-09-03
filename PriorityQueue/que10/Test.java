package que10;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<String>();
		p.add("Black");
		p.add("Red");
		p.add("Green");
		p.add("White");
	    System.out.println("Original priority Queue : "+p);
	    
	    String s[]=new String[5];
	    p.toArray(s);
	    System.out.println("Array containing all elements : "+p);

	    
	}

}
