package que11;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
        str.add("Red");
        str.add("Green");
        str.add("Black");
        str.add("Pink");
        str.add("Orange");
        System.out.println(str);
        for(int i=0;i<str.size();i++){
        	System.out.println("Element at index : "+i+" "+str.get(i));  
        }
       	}

}
