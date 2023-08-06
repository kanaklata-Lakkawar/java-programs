package que3;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedList<String> str=new LinkedList<String>();
		str.add("Red");
		str.add("Green");
		str.add("Black");
		str.add("White");
		str.add("Pink");
		System.out.println(str);
		System.out.println("Enter position");
		int num=sc.nextInt();
		//str.listIterator(num);
		Iterator list=str.listIterator(num);
		while(list.hasNext()){
			System.out.println(list.next());
		}
		
	}

}
