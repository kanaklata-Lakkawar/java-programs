import java.util.Scanner;
 /* java program that reads an integer between 0 and 1000
      and adds all the digit in the number */
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
