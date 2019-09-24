package com.bridgelabz.unittests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.bridgelabz.utility.AlgorithmUtility;

public class AlgorithmUnitTest {

	@Test
	public void testBubbleSort() {
		int[] arr= {2,1,3};
		int[] arr2= {1,2,3};
		assertArrayEquals(AlgorithmUtility.intBubbleSort(arr), arr2);
	}
	
	@Test
	public void testPrimeNumber() {
		assertTrue(AlgorithmUtility.isPrime(3));
		assertFalse(AlgorithmUtility.isPrime(1));
	}
	

	@BeforeClass
	public static void testBinarySearch() {
		String[] arr= {"rishi","abhya","vishnya"};
		assertEquals(AlgorithmUtility.stringBinarySearch(arr, "abhya"), 1);
	}

}
