package Q3;
abstract class Animals{
	abstract void cats();
	abstract void dogs();
	
}
class Cats extends Animals {

	@Override
	void cats() {
		System.out.println("Cats meow meow");
		
	}

	
	
}
class Dogs extends Animals{

	

	@Override
	void dogs() {
		System.out.println("Dogs Bhaoo Bhaoooo");
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		Cats c=new Cats();
		c.cats();
		Dogs d=new Dogs();
		d.dogs();
	}

}
