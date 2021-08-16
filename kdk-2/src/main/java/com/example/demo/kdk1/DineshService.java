package com.example.demo.kdk1;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class DineshService {
@Autowired
JdbcTemplate jt;
@Autowired
NamedParameterJdbcTemplate h;
public int insert(Dinesh e)
{
	String sql="insert into emp_info values(?,?,?)";
	
	return jt.update(sql,e.getEmp_id(),e.getEmp_name(),e.getEmp_desig());
}
	
public String  insert1(Dinesh e){
	Map<String,String> d =new HashMap();
	int result = 0;
	String sql = "INSERT INTO EMP_info(emp_id,emp_name,emp_desig) VALUES(:emp_id,:emp_name,:emp_desig)";
	SqlParameterSource p = new MapSqlParameterSource()
			.addValue("emp_id",e.getEmp_id())
			.addValue("emp_name",e.getEmp_name())
			.addValue("emp_name",e.getEmp_desig());
			result = jt.update(sql,p);
			
			if (result > 0)
			{
				return "success inserted successful";
			}
			else
			{
				return "fail not inserted";
			}
}
}