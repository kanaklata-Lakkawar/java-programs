package model;

public class Student {
private int id;
private String name;
Address ad;
public Student() {
	super();
	// TODO Auto-generated constructor stub
}
public Student(int id, String name, Address ad) {
	super();
	this.id = id;
	this.name = name;
	this.ad = ad;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", ad=" + ad + "]";
}

}
