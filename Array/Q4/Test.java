package Q4;

import java.util.Arrays;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size=sc.nextInt();
		double sum=0,avg=0;
        int arr[]=new int[size];
        for(int i=00;i<arr.length;i++){
        	arr[i]=Integer.parseInt(sc.next());
        	sum+=arr[i];
        	avg=sum/size;
        	}
        System.out.println(Arrays.toString(arr));
        System.out.println("Average of array elements "+avg);
        
	}

	
}
