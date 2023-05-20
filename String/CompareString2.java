import java.util.Scanner;

public class CompareString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER STRING 1 : ");
		String s1=(sc.nextLine());
		System.out.println("ENTER STRING 2 : ");
		String s2=(sc.nextLine());
		if((s1.equalsIgnoreCase(s2))==true)
			System.out.println(s1+" is equals to "+s2);
		else
			System.out.println(s1+" is not equals to "+s2);

	}

}
