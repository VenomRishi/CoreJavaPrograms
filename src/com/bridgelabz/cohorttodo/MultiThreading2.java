package com.bridgelabz.cohorttodo;

public class MultiThreading2 {

	public static void main(String[] args) {

		MyRunnableThread myrunnable = new MyRunnableThread();
		Thread t=new Thread(myrunnable);
		//System.out.println(t.getName());
		Thread t2=new Thread(myrunnable);
		t.setPriority(1);
		//System.out.println(t.currentThread());
		//t2.setName("abhya");
		//System.out.println(t2.getName());
		t.start();
		//t2.start();
		System.out.println("Main");
		//System.out.println(t2.currentThread());
		t2.start();
		
		//MyRunnableThread myrunnable2 = new MyRunnableThread();

	}

}
