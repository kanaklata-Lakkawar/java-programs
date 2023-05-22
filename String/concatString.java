import java.util.Scanner;

public class concatString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING 1 : ");
		String s1=(sc.nextLine());
		System.out.println("ENTER STRING 2 : ");
		String s2=(sc.nextLine());
		System.out.println("The concatenated string : "+s1.concat(s2));

	}

}
