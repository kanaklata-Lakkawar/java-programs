import java.util.Scanner;
/* Java program to break an integer into a sequence of individual digits.*/
	
public class Test2 {
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("input the six non-negative digits : ");
	int num=Integer.parseInt(sc.nextLine());
	num%=10;
	System.out.println(num);
}
}
