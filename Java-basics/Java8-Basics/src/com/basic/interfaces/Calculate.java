package com.basic.interfaces;

interface Sqauare {
	void squar();
	static int sq(Integer x) {return x*x;};
}

public class Calculate {

	public static void main(String[] args) {

		Sqauare s1=new SquareOf10();
		s1.squar();
		System.out.println(Sqauare.sq(10));

	}
}

class SquareOf10 implements Sqauare{

	@Override
	public void squar() {
		System.out.println("Square of number is");
		
	}
	
}