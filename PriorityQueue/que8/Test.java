package que8;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue <Integer> p=new PriorityQueue<Integer>();
		p.add(10);
		p.add(14);
		p.add(36);
		p.add(16);
		p.add(22);
		p.add(70);
		p.add(82);
		p.add(89);
		p.add(25);
	    System.out.println(p);
	    System.out.println("The first element in the Queue : "+p.poll()+"\n"+"New PriorityQueue : "+p);
	}

}
