import java.util.Scanner;

public class inchTometer {
    /* java program to read num in inches,and convert it 
     into meters */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT A VALUE OF INCH : ");
		double inch=Double.parseDouble(sc.nextLine());
		double meter=inch*0.0254;
		System.out.println(+inch+" is "+meter+" meters");

	}

}
