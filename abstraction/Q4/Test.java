package Q4;
abstract class Parent{
	Parent(){
		System.out.println("This is constructor of abstract class");
	}
	abstract void a_method();
	void method(){
		System.out.println("This is a normal method of abstract class");
	}
}
class Child extends Parent {

	@Override
	void a_method() {
		System.out.println("This is abstract method");
		
	}
}
public class Test{

	public static void main(String[] args) {
		Child c=new Child();
		c.a_method();
		c.method();

	}
	//Difference between interface and abstract class
}
