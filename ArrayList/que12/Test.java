package que12;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		str.add("Red");
		str.add("Green");
		str.add("Orange");
		str.add("White");
		str.add("Black");
		System.out.println(str);
		System.out.println("Number elements to extract : ");
		int index=sc.nextInt();
		System.out.println("List of "+index+" elements : "+str.subList(0,index));
	}

}
