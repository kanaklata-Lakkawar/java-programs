package que2;

import java.util.LinkedList;

public class Test {

	public static void main(String[] args) {
		LinkedList<String> str=new LinkedList<String>();
		str.add("Green");
		str.add("Black");
		str.add("White");
        str.add("Pink");
        for(String tempList:str){  	
        	System.out.println(tempList);
        }
       
}

}
