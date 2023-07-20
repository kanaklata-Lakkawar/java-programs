package que11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		System.out.println("List before reversing : "+str);
	    Collections.reverse(str);
	    System.out.println("List after reversing : "+str);
	    
	    
	    
	}

}
