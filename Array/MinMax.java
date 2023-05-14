import java.util.Scanner;

public class MinMax {
/*Write a Java program to find maximum and minimum
 element from an array. */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array ; ");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		int num=arr[0];
		int num2=arr[0];
		System.out.print("enter elements of array ; ");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=Integer.parseInt(sc.nextLine());
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>num)
			{
				num=arr[i];
			}
			if(arr[i]<num2)
			{
				num2=arr[i];
			}
		}
		System.out.println("MAXIMUM ELEMENT OF ARRAY IS "+num);
		System.out.println("MINIMUM ELEMENT OF ARRAY IS "+num2);
	}	
	}

