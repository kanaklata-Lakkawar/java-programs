package que10;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<String> h=new HashSet<String>();
		h.add("Red");
		h.add("Green");
		h.add("Black");
		h.add("White");
		System.out.println(h);
		HashSet<String> h1=new HashSet<String>();
		h1.add("Red");
		h1.add("Pink");
		h1.add("Black");
		h1.add("Orange");
		for(String tempList:h){
		if(h1.contains(tempList))
			System.out.println("Yes");
		else
			System.out.println("No");
			
		}

}
}
