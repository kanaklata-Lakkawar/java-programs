import java.util.Scanner;

public class containString2 {
/*Java program to check whether two String objects 
 * contain the same data. 
*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING 1 : ");
		String s1=(sc.nextLine());
		System.out.println("ENTER STRING 2 : ");
		String s2=(sc.nextLine());
		System.out.println(s1.equals(s2));

	}

}
