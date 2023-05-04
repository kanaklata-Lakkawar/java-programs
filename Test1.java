import java.util.Scanner;

public class Test1 {
   
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
    System.out.println("INPUT AN INTEGER BETWEEN 0 AND 100 : ");
	int num=Integer.parseInt(sc.nextLine());
	int rem=0,val=0;
	while(num!=0)
	{ 
		rem=num%10;
		val+=rem;
		num/=10;
	}
	System.out.println("THE SUM OF ALL DIGITS IN number is\n"+val);
	}
}
