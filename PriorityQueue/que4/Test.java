package que4;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue <String>();
		p.add("Black");
        p.add("Red");
        p.add("Green");
        p.add("White");
        System.out.println(p);
        p.add("Blue");
        System.out.println(p);

	}

}
