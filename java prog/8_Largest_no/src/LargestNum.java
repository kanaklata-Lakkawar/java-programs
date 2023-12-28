import java.util.Scanner;

public class LargestNum {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter  three numbers : ");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x>y){
			if(x>z){
				System.out.println("X is greater ");
			}
		}
		
		if(y>x){
			if(y>z){
				System.out.println("y is greater");
			}
		}
		
		if(z>x){
			if(z>y){
				System.out.println("y is greater");
			}
		}
	}

}
