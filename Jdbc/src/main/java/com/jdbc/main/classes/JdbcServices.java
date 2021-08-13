package com.jdbc.main.classes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class JdbcServices {
	
	@Autowired JdbcTemplate jdbctemplate;
	public int insert(Jdbc jdbc) {
		
		String name=jdbc.getName();
		int id=jdbc.getId();
		String mail=jdbc.getGmail();
		int age=jdbc.getAge();
		int phone=jdbc.getPhone();
		String sql = "insert into jdbc values(?,?,?,?,?)";
		
		return jdbctemplate.update(sql,id,name,age,mail,phone);
	}
	
}
