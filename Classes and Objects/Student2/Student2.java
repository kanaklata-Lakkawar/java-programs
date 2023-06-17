public class Student2 
{
	int roll;
	String name;
	String phone;
	String add;
	Student2(int r,String n,String ph,String ad){
		 roll=r;
		 name=n;
		 phone=ph;
		 add=ad;
	}
	void getData()
	{
		System.out.println("Roll : "+roll);
		System.out.println("Name : "+name);
		System.out.println("phone : "+phone);
		System.out.println("Address : "+add);
	}

}
