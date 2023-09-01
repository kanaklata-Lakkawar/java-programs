package que3;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue <String>();
		p.add("Green");
		p.add("Red");
		p.add("Orange");
		System.out.println("Queue 1 : "+(p));
		
		PriorityQueue<String> p1=new PriorityQueue <String>();
		p1.add("Black");
		p1.add("White");
		p1.add("Pink");
		System.out.println("Queue 1 : "+p1);
		p.addAll(p1);
		System.out.println("New Queue  : "+p);
		
		

	}

}
