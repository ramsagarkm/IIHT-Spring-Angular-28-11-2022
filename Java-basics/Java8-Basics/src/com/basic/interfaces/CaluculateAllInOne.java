package com.basic.interfaces;

interface CalInterface {
	void squar();
	static int addition(Integer a,Integer b) {return a+b;};
	static int substraction(Integer a,Integer b) {return a-b;};
	static int square(Integer a,Integer b) {return a*b;};
	static int division(Integer a,Integer b) {return a/b;};
	
}

public class CaluculateAllInOne {

	public static void main(String[] args) {
		CalInterface s1=new CalAll();
		s1.squar();
		System.out.println(CalInterface.addition(20, 10));
		System.out.println(CalInterface.substraction(20, 10));
		System.out.println(CalInterface.square(10, 10));
		System.out.println(CalInterface.division(200, 10));

	}

}
class CalAll implements CalInterface{

	@Override
	public void squar() {
		System.out.println("Callculate All");
		
	}
}