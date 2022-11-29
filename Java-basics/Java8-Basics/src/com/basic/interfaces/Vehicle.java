package com.basic.interfaces;

public class Vehicle {

	public static void main(String[] args) {

		Drivable d1=new Car();
		Drivable d2=new Truck();
		Drivable d3=new Bike();
		d1.driven();
		d2.driven();
		d3.driven();

	}
}
class Car implements Drivable {
	public void driven() {
		System.out.println("The car can be driven");
		
	}
	
}
class Truck implements Drivable {
	public void driven() {
		System.out.println("The Truck can be driven");
		
	}
	
}
class Bike implements Drivable {
	public void driven() {
		System.out.println("The Bike can be driven");
		
	}
	
}