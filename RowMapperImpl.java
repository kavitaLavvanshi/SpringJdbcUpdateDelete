package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class RowMapperImpl implements RowMapper {

	

	@Override
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setAddress(rs.getNString(3));
		student.setCity(rs.getNString(4));
		
		return student;
	}

	

	
}
