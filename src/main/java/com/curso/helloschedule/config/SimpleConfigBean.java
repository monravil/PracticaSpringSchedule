package com.curso.helloschedule.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.curso.helloschedule.beans.TaskBean;

@Configuration()
@EnableScheduling
@ComponentScan(basePackages = "com.curso.helloschedule")
public class SimpleConfigBean {
	
	@Bean(name = "taskBean") 
	public TaskBean taskBean(){
		return new TaskBean();
	}

}
