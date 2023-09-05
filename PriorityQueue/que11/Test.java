package que11;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue <String> p=new PriorityQueue <String>();
		p.add("Black");
		p.add("Red");
		p.add("Green");
		p.add("White");
		System.out.println("Priority Queue : "+p);
		
		String s=p.toString();
		System.out.println("String Representation : "+s);
	}

}
