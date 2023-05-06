import java.util.Scanner;

public class Test {
    /* java program to print temperature from fahrenheit 
     to celsius */
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER TEMPERATURE IN FARHENITE : ");
		double temp=Double.parseDouble(sc.nextLine());
		double c;
		c=(temp-32)*0.56;
		System.out.println(+temp+" degree farhenite is equals\n to "+c+" in celsius");
	}

}
