import java.util.Scanner;

public class Student {
int roll;
double p1,p2,p3,avg;
Scanner sc=new Scanner(System.in);
void setData()
{
	System.out.println("Enter Roll No. :");
	roll=Integer.parseInt(sc.nextLine());
	System.out.println("Enter Marks :");
	System.out.println("paper 1 :");
	p1=Double.parseDouble(sc.nextLine());
	System.out.println("paper 2 :");
	p2=Double.parseDouble(sc.nextLine());
	System.out.println("paper 3 :");
	p3=Double.parseDouble(sc.nextLine());
}   
void getData()
{
	avg=(p1+p2+p3)/3;
	System.out.println("Roll : "+roll+"\nPaper 1 Marks : "+p1+"\nPaper 2 Marks :"+p2+"\nPaper 3 Marks : "+p3+"\nAverage :"+avg);
}

}
