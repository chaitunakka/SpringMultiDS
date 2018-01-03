package com.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JDBCEg{
	
	@Autowired
	@Qualifier("customerDS")
	DataSource customerDS;
	
	@Autowired
	@Qualifier("employeeDS")
	DataSource employeeDS;
	
	@RequestMapping(path = "/h")
	public DataSource readDB(){
		JdbcTemplate customerJT = new JdbcTemplate(customerDS);
		JdbcTemplate employeeJT = new JdbcTemplate(employeeDS);
		return customerDS;
	}
}
