import java.util.Scanner;
/*Write a Java program to replace all the 'd' 
 * characters with 'f' characters*/
public class ReplaceChar {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER ANY STRING : ");
		String s=(sc.nextLine());
		System.out.println("Enter character you want to replace : ");
        char s1=(sc.next()).charAt(0);
        System.out.println("Enter character you want to replace with : ");
        char s2=(sc.next()).charAt(0);
        System.out.println(s.replace(s1,s2)); 
	}

}
