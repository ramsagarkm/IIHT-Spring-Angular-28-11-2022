package com.basics.lambda;

import java.util.function.Predicate;

public class PredicateExample {

	public static void main(String[] args) {
		Predicate<Integer> predicate1= num ->(num>20);//Calling the predicate
		System.out.println(predicate1.test(20));//Calling predicate method

	}

}
