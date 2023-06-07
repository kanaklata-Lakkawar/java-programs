import java.util.Scanner;

public class ReplaceString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY STRING : ");
		String s=(sc.nextLine());
		System.out.println("Enter string you want to replace : ");
        String s1=(sc.nextLine());
        System.out.println("Enter string you want to replace with : ");
        String s2=(sc.nextLine());
        System.out.println(s.replace(s1,s2)); 

	}

}
