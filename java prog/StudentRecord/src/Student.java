import java.util.Scanner;

public class Student {
	int roll;
	String name;
	Double intMarks;
	Double paperMarks;
	Double tot;
	String result;
	Scanner sc=new Scanner(System.in);
	void setData()
	{
	System.out.print("ENTER YOUR NAME : ");
	name=sc.nextLine();
	System.out.print("ENTER ROLL NO : ");
	roll=Integer.parseInt(sc.nextLine());
	System.out.print("ENTER INTERNAL MARKS : ");
	intMarks=Double.parseDouble(sc.nextLine());
	System.out.print("ENTER PAPER MARKS : ");
	paperMarks=Double.parseDouble(sc.nextLine());
    }
    void getData()
    {
      if(roll!=0)
      {   
    	  tot=intMarks+paperMarks;
    		if(tot>=35)
    			result="PASS";
    		else
    			result="FAIL";
     System.out.println(roll+"\t"+name+"\t"+intMarks+"\t\t"+paperMarks+"\t\t"+tot+"\t\t"+result);
      }
    }
    void deleteStudent(Student s[],int tempRoll)
    {
    	if(tempRoll==roll)
    	{
    		System.out.println("DO YOU REALLY WANT TO DALETE THIS RECORD ?\n1.YES\t2.NO");
    	    int ch=Integer.parseInt(sc.nextLine());
    	    switch(ch)
    	    {
    	    case 1:roll=0;
    	           name="";
    	           System.out.println("OK...RECORD DELETED ");
    	    	break;
    	    case 2:System.out.println("OK...NO RECORD DELETED ");
    	    	break;
    	    }	
    	}
    }
    void searchStudent(Student s,int tempRoll1)
    {
        if(tempRoll1==roll)
    	{
            s.getData(); 
    	}
    }
    void updateStudent(Student s[],int tempRoll2)
    {
        	if(tempRoll2==roll)
        	{
            	boolean lp1=true;
            	while(lp1)
            	{
            	System.out.println("1.NAME\n2.INTERNAL MARKS\n3.EXTERNAL MARKS\n0.EXIT\n");
               	System.out.print("ENTER YOUR CHOICE : ");
               	int ch=Integer.parseInt(sc.nextLine());
            	switch(ch)
            	{
            	case 1:System.out.println("ROLL NO : "+roll+" CURRENT NAME IS : "+name);
            	       System.out.print("ENTER NEW NAME : ");
            	       String tempName=sc.nextLine();
            	       System.out.print("DO YOU REALLY WANT TO CHANE NAME TO "+tempName+"\n1.YES\t2.NO\n");
            	       int ch1=Integer.parseInt(sc.nextLine());
               	    switch(ch1)
               	    {
               	    case 1:name=tempName;
               	           System.out.println("OK...NAME UPDATED ");
               	    	break;
               	    case 2:System.out.println("OK..NAME IS NOT UPDATE");
               	    	break;
               	    }	
            	break;
               case 2:System.out.println("ROLL NO : "+roll+" INTERNAL MARKS IS : "+intMarks);
     	              System.out.print("ENTER INTERNAL MARKS : ");
     	              double tempIntMarks=Double.parseDouble(sc.nextLine());
     	              System.out.print("DO YOU REALLY WANT TO CHANE NAME TO "+tempIntMarks+"\n1.YES\t2.NO\n");
     	              int ch2=Integer.parseInt(sc.nextLine());
        	   switch(ch2)
        	    {
        	    case 1:intMarks=tempIntMarks;
        	           System.out.println("OK...INTERNAL MARKS IS UPDATED ");
        	    	break;
        	    case 2:System.out.println("OK..INTERNAL MARKS IS NOT UPDATED");
        	    	break;
        	    }
            		break;
            	case 3:System.out.println("ROLL NO : "+roll+" PAPER MARKS IS : "+paperMarks);
      	               System.out.print("ENTER INTERNAL MARKS : ");
      	               double tempPaperMarks=Double.parseDouble(sc.nextLine());
      	               System.out.print("DO YOU REALLY WANT TO CHANE NAME TO "+tempPaperMarks+"\n1.YES\t2.NO\n");
      	               int ch3=Integer.parseInt(sc.nextLine());
         	    switch(ch3)
         	    {
         	    case 1:paperMarks=tempPaperMarks;
         	           System.out.println("OK...PAPER MARKS IS UPDATED ");
         	    	break;
         	    case 2:System.out.println("OK..PAPER MARKS IS NOT UPDATED");
         	    	break;
         	    }
            		break;
            	case 0:lp1=false;
            		break;
            	}
        	}
        }	
    }
    }
    
