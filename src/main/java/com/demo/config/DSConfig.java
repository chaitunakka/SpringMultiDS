package com.demo.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DSConfig {

	@Bean
	@Primary
	@Qualifier("employeeDS")
	@ConfigurationProperties(prefix="employee.datasource")
	public DataSource getEmployee(){
		return DataSourceBuilder.create().build();
	}
	
	@Bean
	@Qualifier("customerDS")
	@ConfigurationProperties(prefix="customer.datasource")
	public DataSource getCustomer(){
		return DataSourceBuilder.create().build();
	}
}
