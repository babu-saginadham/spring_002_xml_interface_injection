package com.service;

public class VehicleService {

	String name;
	public VehicleService(String name) {
		this.name = name;
	}
	
	
	Vehicle vehicle;
	public void setVehicle(Vehicle vehicle) {
		//Vehicle vehicle = new TwoWheeler();
		//Vehicle vehicle = new FourWheeler();
		this.vehicle = vehicle;
	}


	public void print_vehicle_details() {
		System.out.println("Vehicle Name:" + this.name);
		
		//Expectation : Vehicle two = new TwoWheeler();
		vehicle.start();
		vehicle.stop();
		
	}
	
}
