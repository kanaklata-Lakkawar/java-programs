package que2;

import java.util.PriorityQueue;

public class Test {

	public static void main(String[] args) {
		PriorityQueue<String> p=new PriorityQueue <String>();
		p.add("Black");
		p.add("Green");
		p.add("Orange");
		p.add("White");
		p.add("Red");
		
		for(String tempList:p){
		System.out.println(tempList);
		}
		}

}
