package com.basic.ref.constructor;

public class ConsMain {

	public static void main(String[] args) {
		System.out.println("We are studing cons ref");
		/*IStudent iStudent=()->{
			return new Student();
		};*/
		IStudent iStudent=()-> new Student();

	}

}
