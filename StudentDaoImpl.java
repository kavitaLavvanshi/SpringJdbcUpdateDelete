package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	@Override
	public int insert(Student student) {
		// inserting data
		String query = "insert into Student values(?,?,?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity(),
				student.getAddress());
		return r;

	}

	// @Override
	public int change(Student student) {
		// updating data
		String query = "update student set name=?, city=?, address=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getAddress(),
				student.getId());
		return r;
	}

	// @Override
	public int delete(int studentId) {
		// deleting data
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query, studentId);
		return r;
	}

	@Override
	public Student getStudent(int StudentId) {
		// select single unit data using row mapper
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query, rowMapper, StudentId);
		return student;
	}
	
	
	@Override
	public List<Student> getAllStudents() {
		//select multiple object(students)
		String query="select * from student";
	    List<Student> students=	this.jdbcTemplate.query(query,new RowMapperImpl());
		return students;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	

}
