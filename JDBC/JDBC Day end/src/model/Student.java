package model;

public class Student {

	private String name;
	private int marks;
	
	public Student(String string, int int1) {
		this.name=string;
		
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getMarks() {
		return marks;
	}

}
