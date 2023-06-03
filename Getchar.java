import java.util.Scanner;
/*a Java program to get the character at the given index within the String.*/
public class Getchar {
	public static void main(String[] args)
	{
		String og="Asterisc Computer Institute";
		System.out.println("original string is : "+og);
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER INDEX : ");
		int index=Integer.parseInt(sc.nextLine());
		
		System.out.println("the character at position "+index+" is "+og.charAt(index));
		
	}

}
