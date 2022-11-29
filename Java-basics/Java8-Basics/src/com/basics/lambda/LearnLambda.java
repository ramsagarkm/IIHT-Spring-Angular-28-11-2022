package com.basics.lambda;

public class LearnLambda {

	public static void main(String[] args) {
		//System.out.println("Hello");
		
		MathOperation add = (Integer a, Integer b)->a+b;
		System.out.println(add.Opration(100, 50));
		
		MathOperation sub = (Integer a, Integer b)->a-b;
		System.out.println(sub.Opration(100, 50));
		
		MathOperation mul = (Integer a, Integer b)->a*b;
		System.out.println(mul.Opration(100, 50));
		
		MathOperation div = (Integer a, Integer b)->a/b;
		System.out.println(div.Opration(100, 50));
		
	}
}
