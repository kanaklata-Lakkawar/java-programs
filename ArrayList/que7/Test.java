package que7;
/* ArrayList program to find element in the list*/
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
System.out.println("Enter element you want to find : ");
String s=sc.next();

if(str.contains(s))
	System.out.println("Found the element");
	System.out.println("This element is not in the List");}
	
	}
