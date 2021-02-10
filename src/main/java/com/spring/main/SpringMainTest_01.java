package com.spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.VehicleService;

public class SpringMainTest_01 {

	public static void main( String[] args )
	{
		//Loading from class path
		ClassPathXmlApplicationContext ac = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		VehicleService vehicleService = (VehicleService) ac.getBean("vehicleService");
		vehicleService.print_vehicle_details();
		
	}
}
