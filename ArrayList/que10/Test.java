package que10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		System.out.println(str);
System.out.println("List after shuffling : \n");
Collections.shuffle(str);
System.out.println(str);
}

}
