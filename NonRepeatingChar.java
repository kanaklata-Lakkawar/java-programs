import java.util.Scanner;

public class NonRepeatingChar {
	public static void main(String[] args){
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter any string : ");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++){
			boolean unique=true;
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)&& i!=j){
					  unique=false;
				}
			}
		}
		if(true)
		{
			for(int i=0;i<s.length();i++){
			System.out.println("char :"+s.charAt(i));
			}
		}
	
		}
	}


