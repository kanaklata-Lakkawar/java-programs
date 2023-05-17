import java.util.Scanner;

public class Test {
/*Write a Java program to remove/insert a specific 
 element from an array. */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter size of array ; ");
		int size=Integer.parseInt(sc.nextLine());
		int arr[]=new int[size];
		System.out.print("enter elements of array ; ");
		for(int i=0;i<arr.length;i++)
		{
			 arr[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("enter the number to remove from array ; ");
		int num=Integer.parseInt(sc.nextLine());
		for(int i=0;i<arr.length;i++)
		{
			if(num==arr[i])
			{
				arr[i]=arr[i+1];
			}
		}
		System.out.println("ELEMENT OF ARRAY ARE : ");
		for(int i=0;i<arr.length;i++)
		{
		System.out.print("\t"+arr[i]);
		}
	}	
	}

