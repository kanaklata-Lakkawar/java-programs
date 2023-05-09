import java.util.Scanner;
/Write a Java program to sum values of an array*/
public class Arraysum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of an array : ");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int [size];
		int sum=0;
		for(int i=0;i<size;i++)
		{
			arr[i]=Integer.parseInt(sc.nextLine());
			sum+=arr[i];
		}
		System.out.println("the sum of array elements is : "+sum);
		
	}

}
