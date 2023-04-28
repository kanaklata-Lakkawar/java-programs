import java.util.Scanner;

public class Record {
public static void main(String a[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("STUDENT RECORD MANAGEMNT SYSTEM");
	Student s[]=new Student[12];
	int st=0;
	boolean lp=true;
	while(lp)
	{
	System.out.println("MENU\n1.ADD STUDENT\n2.SHOW STUDENT\n3.DELETE STUENT\n4.SEARCH STUDENT\n5.UPDATE STUDENT");
	System.out.print("ENTER YOUR CHOICE : ");
	int ch=Integer.parseInt(sc.nextLine());
	switch(ch)
	{
	case 1:System.out.println("------------ ADD STUDENTS -----------");
	       int i=st;
	       System.out.print("ENTER NUMBER OF STUDENTS : ");
	       int n=Integer.parseInt(sc.nextLine());
	       st=n+i;
	       for(;i<st;i++)
	       {System.out.println("\nSTUDENT : "+(i+1));
		   s[i]=new Student();
	       s[i].setData();
	       }
		break;
	case 2:System.out.println("------------ ALL STUDENTS RECORD -----------");
	       System.out.println("ROLL NO\tNAME\tINTERNAL MARKS\tPAPER MARKS\tTOTAL MARKS\tRESULT");
		   for(i=0;i<st;i++)
           {
	        s[i].getData();
           }
		break;
	case 3:System.out.println("------------ DELETE STUDENTS RECORD -----------");
		   System.out.print("ENTER ROLL NO : ");
           int tempRoll=Integer.parseInt(sc.nextLine());
		   for(i=0;i<s.length;i++)
           {
           s[i].deleteStudent(s,tempRoll);
           }
		break;
	case 4:System.out.println("------------ SEARCH STUDENT -----------");
		   System.out.print("ENTER ROLL NO : ");
           int tempRoll1=Integer.parseInt(sc.nextLine());
		   for(i=0;i<s.length;i++)
		  {
			s[i].searchStudent(s[i],tempRoll1);  
          }          
		break;
	case 5:System.out.println("------------ UPDATE STUDENTS RECORD -----------");
	       System.out.print("ENTER ROLL NO : ");
           int tempRoll2=Integer.parseInt(sc.nextLine());
           for(i=0;i<s.length;i++)
		  {
			s[i].updateStudent(s,tempRoll2);  
          }          
		break;
	case 0:System.out.println("THANK YOU FOR USING THE SYSTEM !!!");
		lp=false;
		break;
	}
	}
}
}


