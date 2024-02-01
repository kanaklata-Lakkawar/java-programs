package model;

import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answer> ans;
	public Question() {
		super();
		
	}
	
	public Question(int id, String name, List<Answer> ans) {
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
