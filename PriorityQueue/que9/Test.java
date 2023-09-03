package que9;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue <Integer> p= new PriorityQueue <Integer>();
		p.add(10);
		p.add(14);
		p.add(36);
		p.add(16);
		p.add(22);
		p.add(70);
       p.add(82);
       p.add(89);
       p.add(25);
       
       System.out.println("Orirginal Queue : "+p);
       System.out.println("Removes the first element : "+p.element());
       p.remove(10);
       System.out.println("Queue after removing first elements : "+p);
	}

}
