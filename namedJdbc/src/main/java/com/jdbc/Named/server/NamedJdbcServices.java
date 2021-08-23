package com.jdbc.Named.server;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import org.slf4j.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;


@Service
public class NamedJdbcServices {
	@Autowired NamedParameterJdbcTemplate npjt ;
	 @Autowired
	    private JdbcTemplate jdbcTemplate;
	 final Logger Log = LoggerFactory.getLogger(NamedJdbcServices.class);
	public Map<String,String> insert(NamedJdbc namedjdbc) {
		
		Map<String,String> m=new HashMap<String, String>();
		String sql ="insert into jdbc (name,gmail,age,phone) values(:name,:gmail,:age,:phone)";
		Log.info("******************************************");
			SqlParameterSource par = new MapSqlParameterSource()
					.addValue("gmail",namedjdbc.getGmail())
					.addValue("phone", namedjdbc.getPhone())
					.addValue("age",namedjdbc.getAge())
					.addValue("name", namedjdbc.getName());
			int result=npjt.update(sql, par);
			if(result>0) {
				Log.info("Success");
				m.put("success", "Data Inserted Succesfully");
			}else {
				m.put("failed", "Data Failed to insert");
			}
			
		
		return m;
	}
	public Map<String, String> update(NamedJdbc nja) {
		Map<String,String> m=new HashMap<String, String>();
		String sql ="update jdbc set ";
		
		if(nja.getName()!=null) {
			String sql1 ="name = :Name,";
			sql=sql+sql1;
		}if(nja.getAge()!=0 ) {
			String sql1 ="age = :Age,";
			sql=sql+sql1;
		}
		if(nja.getGmail()!=null) {
			String sql1 ="gmail = :Gmail,";
			sql=sql+sql1;
		}
		if(nja.getPhone()!=0){
			String sql1 ="phone = :Phone,";
			sql=sql+sql1;
		}
		sql=sql.substring(0,sql.length()-1);
		sql=sql+" where id ="+nja.getId();
		Log.info("******************************************");
			SqlParameterSource par = new MapSqlParameterSource()
					.addValue("Gmail",nja.getGmail())
					.addValue("Phone", nja.getPhone())
					.addValue("Age",nja.getAge())
					.addValue("Name", nja.getName());
			int result=npjt.update(sql,par);
			if(result>0) {
				Log.info("Success");
				m.put("success", "Data Updated Succesfully");
			}else {
				m.put("failed", "Data Failed to Update");
			}
		return m;
	}
	public List<NamedJdbc> get() {
		String sql= "select * from jdbc ";
		return npjt.query(sql, (rs,rownum)->
		new NamedJdbc(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getInt(5)));
		
	}
	public List<NamedJdbc> getOffset( Offset offset){
		
		String sql = "SELECT * from jdbc limit ";
		int from = (offset.getPage() - 1) * offset.getPageSize();
		sql=sql+from+","+offset.getPageSize();
		  return jdbcTemplate.query(sql,(rs,rowNum)->
		  new NamedJdbc(
				  rs.getInt(1),
				  rs.getString(2),
				  rs.getInt(3),rs.getString(4),rs.getInt(5)));
		
	}
		
}
