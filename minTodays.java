import java.util.Scanner;
/*java program to print number of minutes into years and days*/
public class minTodays {
   
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("INPUT NUMBER OF MINUTES : ");
		int min=Integer.parseInt(sc.nextLine());
        int yr=min/(60*24*365);
        int day=(min/1440)-(yr*365);
        System.out.println(+min+" minutes is approximately \n"+yr+" years and "+day+" days");
	}

}
