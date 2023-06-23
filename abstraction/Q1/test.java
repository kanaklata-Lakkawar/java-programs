abstract class Parent{
	
	abstract void message();
	
}
class Child extends Parent{

	@Override
	void message() {
		System.out.println("This is First Subclass");	
	}	
}
class Child1 extends Parent{
	void message(){
		System.out.println("This is second subclass");
	}
}
public class test {

	public static void main(String[] args) {
		Child c=new Child();
		c.message();
		Child1 c1=new Child1();
		c1.message();
		
	}
}


