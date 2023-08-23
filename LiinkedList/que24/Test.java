package que24;

import java.util.LinkedList;

import javax.print.DocFlavor.STRING;

public class Test {
public static void main(String[]args){
	LinkedList <String> str=new LinkedList();
	str.add("Red");
	str.add("Green");
	str.add("Black");
	str.add("White");
	str.add("Pink");
	System.out.println("List 1 "+str);
	LinkedList <String>str1=new LinkedList<String>();
	str1.add("Red");
	str1.add("Green");
	str1.add("Black");
    str1.add("Pink");
	System.out.println("List 2 : "+str1);
	for(String tempList:str){
		if(str1.contains(tempList))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	
	}

}
