package com.bridgelabz.cohorttodo;

public class MultiThreading1 {

	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.setPriority(1);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Method");	
		}
		
		//t.start();

	}
}
