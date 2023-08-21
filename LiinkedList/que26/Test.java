package que26;

import java.util.Collections;
import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String>str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("White");
		str.add("Pink");
		System.out.println("Original LinkedList : "+str);
		Collections.replaceAll(str, "Green","Orange" );
		System.out.println("New linked LIst : "+str);
	}

}
