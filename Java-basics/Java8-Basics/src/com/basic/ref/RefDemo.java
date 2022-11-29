package com.basic.ref;

public class RefDemo {

	public static void main(String[] args) {
		System.out.println("Method Refence Demo");
	/*	
		IWork iwork=()->{
			System.out.println("This is do project from IWork");
		};
		iwork.doProject(); */
		
		//classname::methodname
		IWork iwork= ProjectDemo::projectProgress;
		iwork.doProject();
		
		Runnable runnable= ProjectDemo::threadTask;
		Thread t1=new Thread(runnable);
		t1.start();
		
		Runnable runnable1= ProjectDemo::oddTo100;
		Thread t2=new Thread(runnable1);
		t2.start();
		
	}
}
