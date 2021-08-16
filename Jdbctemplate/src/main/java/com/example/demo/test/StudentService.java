package com.example.demo.test;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired 
	JdbcTemplate jt;
	@Autowired 
	NamedParameterJdbcTemplate np;
	public int insert(Student s)
	{
		int id=s.getId();
		int age= s.getAge();
		String name= s.getName();
		int no= s.getPhoneNo();
		String sql= "insert into student values(?,?,?,?)";
		return jt.update(sql,id,name,age,no);
	}
	public int updatetable(Student s)
	{
		String sql1="update student set name=? where id=?"; 
		return jt.update(sql1,s.getName(),s.getId());
	}

	public Map<String,String> insertn(Student s)
	{
		Map<String,String> m=new HashMap();
		String sql2= "insert into student(id,name,age,phoneNo) values(:id,:name,:age,:phoneNo)";
		SqlParameterSource sps = new MapSqlParameterSource()
				.addValue("id",s.getId())
				.addValue("name",s.getName())
				.addValue("age",s.getAge())
				.addValue("phoneNo",s.getPhoneNo());
		int i=np.update(sql2,sps);
		if(i>0)
		{
			m.put("200", "Inserted Successfully");
		}
		else
		{
			m.put("Failed", "Data insertion Failed");
		}
		return m;
	}
}

