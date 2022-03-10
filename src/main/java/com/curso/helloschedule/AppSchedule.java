package com.curso.helloschedule;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.curso.helloschedule.beans.TaskBean;
import com.curso.helloschedule.config.SimpleConfigBean;

public class AppSchedule 
{
    public static void main( String[] args ) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(SimpleConfigBean.class);
		TaskBean tBean = ctx.getBean(TaskBean.class);
    }
}
