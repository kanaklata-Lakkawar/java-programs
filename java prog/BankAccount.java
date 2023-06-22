import java.util.Scanner;

public class BankAccount {
	String name;
	String accType;
	int ch;
	Scanner sc=new Scanner(System.in);
	void setInfo(){
		System.out.println("Enter Name :");
		name=sc.nextLine();
		System.out.println("Select type of account : \n1.Saving account\n2.Current account");
		System.out.println("Enter choice : ");
		ch=Integer.parseInt(sc.nextLine());
	    switch(ch){
	    case 1:accType="Saving Account";
	    	break;
	    case 2:accType="Current Account";
	    	break;
	    }
	}

}
