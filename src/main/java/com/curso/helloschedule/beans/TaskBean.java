package com.curso.helloschedule.beans;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TaskBean {
	@Scheduled(fixedDelay=5000)
    public void t1(){
        System.out.println("Started fixed delay job");
    }

	@Scheduled(fixedRate=5000)
    public void t2(){
        System.out.println("Started fixed rate job");
    }

	@Scheduled(fixedRate=60*60*1000, initialDelay=10*60*1000)
    public void t3(){
        System.out.println("Started fixed rate job");
    }

	@Scheduled(cron="*/2 * * * * *")
	public void updateEmployeeInventory(){
		System.out.println("Started cron job");
	}	 
}
