package que9;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str1=new ArrayList<String> ();
	    ArrayList<String> str2=new ArrayList<String>();	
	    str1.add("1");
	    str1.add("2");
	    str1.add("3");
	    str1.add("3");
	    str1.add("4");
	    System.out.println("List 1 : "+str1);
	    str2.add("A");
	    str2.add("B");
	    str2.add("C");
	    str2.add("D");
	    System.out.println("List 2 : "+str2);
	    
	    str1=(ArrayList)str2.clone();
	   System.out.println("\nAfter Copy :\nList 1 : "+str1);
	   System.out.println("List 2 : "+str2);
	    
	}

}
