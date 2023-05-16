import java.util.Scanner;

public class SortArray {

	public static void main(String[] args) {
// java program to sort a numeric array and string array
       Scanner sc=new Scanner(System.in);
       System.out.println("enter size of array : ");
       int size=Integer.parseInt(sc.nextLine());
       int num[]=new int[size];
       int temp;
       System.out.print("enter the array elements : ");
       for(int i=0;i<num.length;i++)
       {
    	   num[i]=Integer.parseInt(sc.nextLine());
       }
       for(int i=0;i<size;i++)
       {
    	   for(int j=i+1;j<size;j++)
    	   {
    		  if(num[i]>num[j])
    		  {
    			  temp=num[i];
    			  num[i]=num[j];
    			  num[j]=temp;
    		  }
    	   }
       }
    System.out.println("SORTED ARRAY ELEMENTS ARE : ");
      for(int j=0;j<size;j++)   
       {
    System.out.print(+num[j]+"\t");  
       }
	} 
}
