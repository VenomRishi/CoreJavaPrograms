package com.bridgelabz.cohortPrograms;

import java.util.Arrays;
import java.util.Scanner;

public class Problem3 {
	public static void main(String[] args) {
		/**
		 * Problem statement:
		 * 
		 * input:
		 * 
		 * 1,3,5,-1,-5,100
		 * 
		 * 
		 * -5,-1,1,3,5,100
		 * 
		 * output:
		 * 
		 * -5,1,-1,3,5,100
		 */
//		System.out.println("Enter elements count");
		Scanner scanner = new Scanner(System.in);
		//int n = scanner.nextInt();
		//int[] arr = new int[n];
		int[] arr= {1,3,5,-1,-5,100};
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println("Enter element " + i);
//			arr[i] = scanner.nextInt();
//		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int temp1,temp2,count1 = 0,count2=0;
		int counter=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<0) {
				temp1=arr[i];
				count1++;
				for (int j = i+1; j < arr.length; j++) {
					if(arr[j]>0&&count1==0) {
						temp2=arr[j];
						System.out.print(temp1 + " "+temp2);
						count1=j+1;
						break;
					}else if(arr[j]>0) {
						temp2=arr[count1];
						System.out.print(temp1 + " "+temp2);
					}
				}
			}else {
				System.out.println(arr[counter]);
			}
			counter++;
		}
		scanner.close();
	}
}
