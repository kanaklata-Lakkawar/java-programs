package que13;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str1=new ArrayList<String>();
		str1.add("Red");
		str1.add("Green");
		str1.add("Black");
		str1.add("White");
		str1.add("Pink");
		ArrayList<String> str2=new ArrayList<String>();
		System.out.println("List1 : "+str1);
		str2.add("Red");
		str2.add("Green");
		str2.add("Black");
		str2.add("Pink");
		System.out.println("List2 : "+str2);
		
	    for(String tempList:str1){
if(str2.contains(tempList))
	System.out.println("Yes");
else System.out.println("No");
//System.out.println(str2.contains(tempList));
	    
	    }

}
	}
