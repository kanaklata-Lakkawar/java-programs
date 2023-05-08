import java.util.Scanner;

public class ArrayTest {
/* java program to test if array contains a specific value */
	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       System.out.print("enter size of array :");
       int size=Integer.parseInt(sc.nextLine());
       int arr[]=new int[size];
       System.out.print("enter array elements:");
       for(int i=0;i<size;i++)
       {
    	   arr[i]=Integer.parseInt(sc.nextLine());
       }
       System.out.println("enter number :");
       int num=Integer.parseInt(sc.nextLine());
       for(int i=0;i<size;i++)
       {
    	      if(num==arr[i])
    	      {
              System.out.println("yes,array contains this number");
    	      }
    	      
       }
       
	}

}
