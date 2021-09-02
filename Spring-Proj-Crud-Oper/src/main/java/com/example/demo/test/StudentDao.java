package com.example.demo.test;

import java.util.*;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class StudentDao {
	//private static final Student name = null;
	Logger logger=Logger.getLogger(StudentDao.class);
	@Autowired
	JdbcTemplate jdbctemplate;
	NamedParameterJdbcTemplate jpt;
	private  static Logger log=LogManager.getLogger("StudentDao.class");

	public StudentDao(JdbcTemplate jdbctemplate) {

		this.jdbctemplate = jdbctemplate;
	}

	//update method
	public String update(Student s) {
		System.out.println("Student update method execution starts");
		String query="update student set name=? where id=?";
		int id=s.getId();
		String name=s.getName();
		int res=jdbctemplate.update(query,name,id);
		if(res>0) {
			log.info("record updated sucessfully");
		}
		else {

			return "data failed";
		}

		logger.info("update method");
		logger.debug("A debug message");
		logger.warn("program executed");


		log.info("update method execution fails");
		return name;

	}

	//insert query
	public String saveStudent(Student s) {
		String query="insert into student values(?,?,?,?)";
		int id=s.getId();
		String name=s.getName();
		int age=s.getAge();
		String address=s.getAddress();
		int res=jdbctemplate.update(query,id,name,age,address);
		if(res>0) {
			log.info("data inserted sucessfully");
			return "data inserted sucessfully";
		}
		else
			log.info("data insertion failed");
		return"data insertion failed";

	}

	//delete an item
	//delete method
	public int deleteStudent(Student s) {
		String query="delete from student where id=?";
		int id=s.getId();
		int res=jdbctemplate.update(query,id);
		if(res>0)
		{
			System.out.println("data deleted sucessfully");
		}
		else {
			System.out.println("deletion falied");
		}

		return jdbctemplate.update(query);
	}

	//select query
	public List selectQuery(Student sv) {
		Map<String,Object> map=null;
		List list1=new ArrayList();
		List<Map<String,Object>>  obj=new ArrayList<Map<String,Object>>();
		String sql="select * from student";
		obj=jdbctemplate.queryForList(sql);
		for(Map<String,Object>s:obj)
		{
			map=new HashMap<String,Object>();
			map.put("id", ((Student) s).getId());
			map.put("name",((Student) s).getName());
			map.put("age",((Student) s).getAge());
			map.put("salary",((Student) s).getAddress());		
		}	
		return obj;	
	}
	public List pageSel1(int page,int size) {
		String query="select * from student limit";
		int i=(page-1)*size;
		Map<String,Object> map1=null;
		List list1=new ArrayList();
		List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
		obj=jdbctemplate.queryForList(query);
		for(Map<String,Object> s:obj) {
			map1=new HashMap<String,Object>();
			map1.put("id", s.get("id"));
			map1.put("id", s.get("name"));
			map1.put("id", s.get("age"));
			map1.put("id", s.get("address"));
			list1.add(map1);

		}

		return list1;

	}

}



