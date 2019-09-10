package com.bridgelabz.algorithm;

import com.bridgelabz.utility.AlgorithmUtility;


public class P5MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = Integer.parseInt("3");
		int range = (int) Math.pow(2, n);
		System.out.println("Range is 0 to " + range);
		AlgorithmUtility.magicNumber(range);

	}

}
