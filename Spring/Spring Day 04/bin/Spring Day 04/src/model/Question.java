package model;

import java.util.List;

public class Question {

	
	private int id;
	private String name;
	private List<String> ans;
	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Question(int id, String name, List<String> ans) {
		super();
		this.id = id;
		this.name = name;
		this.ans = ans;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", name=" + name + ", ans=" + ans + "]";
	}
	
}
