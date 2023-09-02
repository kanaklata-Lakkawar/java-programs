package que5;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue <String> p=new PriorityQueue <String>();
		p.add("Black");
		p.add("Red");
		p.add("Green");
		p.add("White");
	    System.out.println("Original Queue : "+p);
	    
	    p.clear();
	    System.out.println("New Queue : "+p);
	}

}
