package Area;

import java.util.Scanner;

public class AreaMain {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter length : ");
		int length=Integer.parseInt(sc.nextLine());
        System.out.println("Enter breadth : ");
        int breadth=Integer.parseInt(sc.nextLine());
        Area a=new Area(length,breadth);
        a.ReturnArea();
        
	}

}
