import java.util.Scanner;
/*java program to compare two strings*/
public class CountUnicode {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String og;
		System.out.println("ENTER ANY STRING : ");
		og=(sc.nextLine());
		System.out.println("original string : "+og);
		System.out.println("Code points count : "+og.length());
	}
}
