package com.jdbc.Named.server;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Service;


@Service
public class NamedJdbcServices {
	@Autowired NamedParameterJdbcTemplate npjt ;
	static Logger Log =Logger.getLogger(NamedJdbcServices.class);
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
		
}
