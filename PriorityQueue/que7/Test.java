package que7;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue<String>();
	    p.add("Black");
	    p.add("Red");
	    p.add("Green");
	    p.add("White");
	    System.out.println(p);
	    
	    PriorityQueue <String> p1=new PriorityQueue<String>();
	    p1.add("Black");
	    p1.add("Orange");
	    p1.add("Red");
	    p1.add("Pink");
	    System.out.println(p1);
	    
	    for(String tempList:p){
	    	if(p1.contains(tempList))
	    	System.out.println("yes");
	    	else
	    		System.out.println("No");
	    }
	    
	}

}
