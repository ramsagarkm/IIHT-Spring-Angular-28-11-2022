package com.basic.functionaliInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		
		//Consumer<Integer> consumer= (t) -> System.out.println("Printing : "+ t);
			//consumer.accept(4000);
			
		//List<Integer> integerList = Arrays.asList(1,2,3,4,5);
			//integerList.stream().forEach(consumer);
			
			List<Integer> integerList = Arrays.asList(1,2,3,4,5);
			integerList.stream().forEach(number-> System.out.println("Printing :"+ number));
		}

	}
