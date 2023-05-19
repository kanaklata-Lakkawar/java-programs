/*java program to compare two strings.*/
import java.util.Scanner;

public class CompareString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING 1 : ");
		String s1=(sc.nextLine());
		System.out.println("ENTER STRING 2 : ");
		String s2=(sc.nextLine());
	if((s1.compareTo(s2))<0)
		System.out.println(s1+" is less than "+s2);
	if((s1.compareTo(s2))>0)
		System.out.println(s1+" is greater than "+s2);
	}

}
