package que14;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
str.add("Red");
str.add("Green");
str.add("Black");
str.add("White");
str.add("Pink");
System.out.println("ArrayList before swap : \n"+str);
Collections.swap(str, 0,2);
System.out.println("ArrayList after swap : \n"+str);
	}

}
