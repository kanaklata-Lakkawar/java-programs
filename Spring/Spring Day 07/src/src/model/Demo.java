package model;

public class Demo {

	
	public void fun(){
		System.out.println("Main Logic");
	}
	
	public	void myage(int age) throws ArithmeticException
	{
	 if(age<18)
		 throw new ArithmeticException("Age not Vaild");
	 else
	    System.out.println("i am main logic method age");
	}
}
