package que16;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
str.add("Red");
str.add("Green");
str.add("Black");
str.add("White");
str.add("Pink");
System.out.println("Original array list "+str);
ArrayList<String> str1=new ArrayList<String>();
str1=(ArrayList<String>) str.clone();
System.out.println("Cloned array List "+str1);
	}

}
