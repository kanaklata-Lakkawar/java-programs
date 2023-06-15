import java.util.Scanner;

public class AverageMain {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any three number : ");
		int num1=Integer.parseInt(sc.nextLine());
		int num2=Integer.parseInt(sc.nextLine());
		int num3=Integer.parseInt(sc.nextLine());
		Average a=new Average(num1,num2,num3);
		a.calculate();
		
	}

}
