import java.util.Scanner;

public class Test {
/*java program to check whether a given string ends
 *  with the contents of another string*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING 1 : ");
		String s1=(sc.nextLine());
		System.out.println("ENTER STRING 2 : ");
		String s2=(sc.nextLine());
		System.out.println(s1.contentEquals(s2));
	}

}
