/* Program to print the area of arectangle by creating a class named 'Area' taking the value of its 
length and breadth as parameters of its constructor and having a method named 'returnArea' which returns 
the area of rectangle.Length and brewafth of rectanle are  entered through keyboard*/


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
