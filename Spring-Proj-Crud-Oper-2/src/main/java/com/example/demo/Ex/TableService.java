package com.example.demo.Ex;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.demo.SpringProjCrudOper2Application;

@Service
public class TableService {
	 public static Logger log= LoggerFactory.getLogger( SpringProjCrudOper2Application.class);
	@Autowired
	JdbcTemplate jt;
	NamedParameterJdbcTemplate jpt;
	public String insert1(TableEx te)
	{
		String sql="insert into student values(?,?,?,?)";
		int id=te.getId();
		String name=te.getName();
		int age=te.getAge();
		String address=te.getAddress();
		int i=jt.update(sql,id,name,age,address);
		if(i>0)
		{
			log.info("insert sucessfully");
			return "data inserted success";
		}
		else
		{
			log.info("data insertion fails");
			return "data inserted failed";
		}
	}
	public String update1(TableEx te) {
		String sql="update student set name=? where  id=?";
		int id=te.getId();
		String name=te.getName();
		int res=jt.update(sql,name,id);
		if(res>0) {
				log.info("updation sucessful");
			System.out.println("updation sucessful");
		}
		else {
			log.info("updation failed");
			System.out.println("updation failed");

		}
		return name;

	}

	public String delete(TableEx te) {
		String sql="delete from student where id=?";
		int id=te.getId();

		int res=jt.update(sql,id);
		return "data deleted";

	}
	
	public List select(TableEx te) {
		Map<String,Object> map1=null;
		List list=new ArrayList();
		List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
		String sql="select *  from student where id=?";
		obj=jt.queryForList(sql,te.getId());
		for(Map<String,Object> r2:obj) {
			map1=new HashMap<String,Object>();
			map1.put("id", r2.get("id"));
			map1.put("name", r2.get("name"));
			map1.put("age", r2.get("age"));
			map1.put("address", r2.get("address"));
			list.add(map1);
		
		}
		return list;
		
	}
	 public String select23() {
		 
		return "hi";
		 
	 }
	 public String pages11(int page,int size) {
		 String query="select *  from student limit";
		 int i=(page-1)*size;
		 Map<String,Object> map1=null;
		 List list1=new ArrayList();
		 List<Map<String,Object>> obj=new ArrayList<Map<String,Object>>();
		 obj=jt.queryForList(query);
		 for(Map<String,Object>s:obj) {
			 map1.put("id",s.get("Id"));
			 map1.put("name", s.get("name"));
			 map1.put("age", s.get("age"));
			 map1.put("address", s.get("address"));		 
		 } 
		return "name";
		 
	 }
	 
}
	/* public String insert5(TableEx x) {
		 String sql="insert into student("
				
		return null;
		 
	 }
}*/
