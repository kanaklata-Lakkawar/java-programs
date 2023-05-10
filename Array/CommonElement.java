import java.util.Scanner;

public class CommonElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num[]=new int[5];
		System.out.println("Enter size of array 1 : ");
		int size1=Integer.parseInt(sc.nextLine());
		int arr1[]=new int[size1];
		System.out.println("Enter elements of array 1 :");
		for(int i=0;i<size1;i++)
		{
			arr1[i]=Integer.parseInt(sc.nextLine());
		}
		System.out.println("Enter size of array 2 : ");
		int size2=Integer.parseInt(sc.nextLine());
		int arr2[]=new int[size2];
		System.out.println("Enter elements of array 2 :");
		for(int i=0;i<size1;i++)
		{
			arr2[i]=Integer.parseInt(sc.nextLine());
		}
		for(int i=0;i<size2;i++)
		{
			if(arr1[i]==arr2[i])
			{
				num[i]=arr1[i];	
			    System.out.println("common element "+num[i]);
			 }		
		}
		
	}

}
