package Q2;
abstract class Bank{
	abstract void getBalance();
}
class BankA extends Bank{

	@Override
	void getBalance() {
		System.out.println("$100 deposited in Bank");
		
	}
	
}
class BankB extends Bank{

	@Override
	void getBalance() {
		System.out.println("$150 deposited in Bank");
		
	}
	
}
class BankC extends Bank{

	@Override
	void getBalance() {
		System.out.println("$200 deposited in Bank");
		
	}
	
}
public class Test {

	public static void main(String[] args) {
		BankA a=new BankA();
		a.getBalance();
		BankB b=new BankB();
		b.getBalance();
		BankC c=new BankC();
		c.getBalance();

	}

}
