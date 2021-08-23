package com.jdbc.Named;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jdbc.Named.server.NamedJdbcServices;

@SpringBootApplication
public class Jdbc1Application {
	static Logger Log =Logger.getLogger(Jdbc1Application.class);
	public static void main(String[] args) {
		SpringApplication.run(Jdbc1Application.class, args);
	}

}
