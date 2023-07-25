package que15;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str1=new ArrayList<String>();
		ArrayList<String> str2=new ArrayList<String>();
		str1.add("Red");
		str1.add("Green");
		str1.add("Black");
		str1.add("White");
		str1.add("Pink");
		System.out.println("List1 : "+str1);
		str2.add("Red");
		str2.add("Green");
		str2.add("Black");
		str2.add("Pink");
		System.out.println("List2 : "+str2);
		
		str1.addAll(str2);
		System.out.println("New array : "+str1);
		
		
	}

}
