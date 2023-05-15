import java.lang.reflect.Array;
import java.util.Scanner;

public class SortArrayString {

	public static void main(String[] args) {
// java program to sort a numeric array and string array
       Scanner sc=new Scanner(System.in);
       System.out.println("enter size of array : ");
       int size=Integer.parseInt(sc.nextLine());
       String arr[]=new String[size];
       String temp;
       System.out.print("enter the array elements : ");
       for(int i=0;i<arr.length;i++)
       {
    	   arr[i]=(sc.nextLine());
       }
       for(int i=0;i<size;i++)
       {
    	   for(int j=i+1;j<size;j++)
    	   {
    		  if(arr[i].compareTo(arr[j])>0)    		  
    		  {
    			  temp=arr[i];
    			  arr[i]=arr[j];
    			  arr[j]=temp;
    		  }
    	   }
       }
    System.out.println("SORTED ARRAY ELEMENTS ARE : ");
      for(int j=0;j<size;j++)   
       {
    System.out.print(arr[j]+"\t");  
    	    
       }
      
	} 
}

