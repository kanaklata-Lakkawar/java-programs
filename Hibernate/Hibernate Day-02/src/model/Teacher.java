package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teach_tbl")
public class Teacher {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(name="tbl_name")
private String name;
private String sub;



public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSub() {
	return sub;
}
public void setSub(String sub) {
	this.sub = sub;
}
public Teacher() {
	super();
	// TODO Auto-generated constructor stub
}

public Teacher(int id, String name, String sub) {
	super();
	this.id = id;
	this.name = name;
	this.sub = sub;
}
@Override
public String toString() {
	return "Teacher [id=" + id + ", name=" + name + ", sub=" + sub + "]";
}



}
