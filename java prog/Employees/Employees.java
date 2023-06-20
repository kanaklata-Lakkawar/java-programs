import java.util.Scanner;

public class Employees {
	String name;
	double Salary;
	int date;
	Scanner sc=new Scanner(System.in); 
	
	void setData(){
		System.out.println("Enter name : ");
		name=sc.nextLine();
		System.out.println("Enter salary : ");
		Salary=Double.parseDouble(sc.nextLine());
		System.out.println("Enter date of joining : ");
		date=Integer.parseInt(sc.nextLine());
	}
	
	void getData(){
		System.out.println("Name : "+name+"\nSalary : "+Salary+"\nDate of joining : "+date);
	
	}
	
		
	
}
