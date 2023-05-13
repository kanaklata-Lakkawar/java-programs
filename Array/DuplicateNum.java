
import java.util.Scanner;

public class DuplicateNum {
/*Write a Java program to find duplicate
 element from an array. */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array ; ");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		int num=0;
		System.out.print("enter elements of array ; ");
		for(int i=0;i<size;i++)
		{
			 arr[i]=Integer.parseInt(sc.nextLine());
		}
		for(int i=0;i<(size-1);i++)
		{
			if(arr[i]==arr[i+1])
			{
				num=arr[i];
				System.out.println(+num+" is duplicate element in array");
			}
		}
	}	
	}


