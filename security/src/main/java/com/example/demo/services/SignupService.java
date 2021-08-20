package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class SignupService{
	@Autowired JdbcTemplate jt;
	public int Signup(UserS user) {
		String sql ="insert into user (username,password) values(?,?)";
		String password=new BCryptPasswordEncoder().encode(user.getPassword());
		return jt.update(sql,user.getUsername(),password);
	}
}
