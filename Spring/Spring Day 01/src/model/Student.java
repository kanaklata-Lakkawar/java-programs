package model;

//pojo
public class Student {
	
	private int roll;
	private String name;
	public Student() {
		super();
		System.out.println("def const");
	}
	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
		System.out.println("2 para const");
	}
	public Student(int roll) {
		super();
		this.roll = roll;
		System.out.println("1 para roll const");
		
	}
	public Student(String name) {
		super();
		
		this.name = name;
		System.out.println("1 para name const");
	}
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + "]";
	}
	

}
