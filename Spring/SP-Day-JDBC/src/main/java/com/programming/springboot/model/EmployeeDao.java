package com.programming.springboot.model;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
	
	public int saveEmployee(Employee e) {
		
	    String query="insert into employee values("+e.getId()+","+e.getName()+","+e.getSalary()+")";
		return jdbcTemplate.update(query);	
	}
	
}
