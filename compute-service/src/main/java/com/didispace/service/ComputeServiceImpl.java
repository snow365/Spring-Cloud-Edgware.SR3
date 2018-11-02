package com.didispace.service;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;


public class ComputeServiceImpl {
	
	public int add()
	{
		ApplicationContext context = SpringApplication.run(ComputeServiceImpl.class);
        //JdbcTemplate jdbcTemplate = context.getBean(JdbcTemplate.class);
        //jdbcTemplate.execute("delete from properties");
		return 0;
	}
}