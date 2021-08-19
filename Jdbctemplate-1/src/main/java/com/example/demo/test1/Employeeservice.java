package com.example.demo.test1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice {
	@Autowired
	private JdbcTemplate jdbctemplate;
	public List getAll()
	{
		Map dataMap=null;
		List responseList=new ArrayList();
		List<Map<String,Object>> dataList=new ArrayList<Map<String,Object>>();
		String sql="Select eid,ename,emobile,email from employee";
		try {
			dataList=jdbctemplate.queryForList(sql);
			for(Map<String,Object> row:dataList) {
				dataMap=new HashMap();
				dataMap.put("eid",row.get("eid"));
				dataMap.put("ename",row.get("ename"));
				dataMap.put("emobile",row.get("emobile"));
				dataMap.put("email",row.get("email"));
				responseList.add(dataMap);
			}
		}catch(Exception e) {
			dataMap.put("error","error occured");
		}
		return responseList;
	}

public List get(Emloyee eid) {
Map dataMap=new HashMap();
List responseList=new ArrayList();
List<Map<String,Object>> dataList=new ArrayList<Map<String,Object>>();
String sql="Select eid , ename, emobile , email from employee where eid=?";
try {
	dataList=jdbctemplate.queryForList(sql,new Object[] {eid.getEid()});
	for(Map<String,Object> row:dataList){
		dataMap.put("eid",row.get("eid"));
		dataMap.put("ename",row.get("ename"));
		dataMap.put("emobile",row.get("emobile"));
		dataMap.put("email",row.get("email"));
		responseList.add(dataMap);
	}
}catch(Exception e) {
		dataMap.put("error","error occured");
	}
	return responseList;

}
public String delete(Emloyee e) {
	String sql="delete from employee where eid=?";
	int i= jdbctemplate.update(sql,e.getEid());
	if(i>0) {
		return "deleted";
	}
	else {
		return "not updated";
	}
	}
public List getMultiple(int eid,String ename)
{
	Map dataMap=null;
	List responseList=new ArrayList();
	List<Map<String,Object>> dataList=new ArrayList<Map<String,Object>>();
	String sql="Select eid,ename,emobile,email from employee where eid=? OR ename=?";
	try {
		dataList=jdbctemplate.queryForList(sql);
		for(Map<String,Object> row:dataList) {
			dataMap=new HashMap();
			dataMap.put("eid",row.get("eid"));
			dataMap.put("ename",row.get("ename"));
			dataMap.put("emobile",row.get("emobile"));
			dataMap.put("email",row.get("email"));
			responseList.add(dataMap);
		}
	}catch(Exception e) {
		dataMap.put("error","error occured");
	}
	return responseList;
}



}


