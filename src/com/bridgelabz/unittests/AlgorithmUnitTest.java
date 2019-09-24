package com.bridgelabz.unittests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.utility.AlgorithmUtility;

public class AlgorithmUnitTest {

	@Test
	public void testBubbleSort() {
		int[] arr= {2,1,3};
		int[] arr2= {1,2,3};
		assertArrayEquals(AlgorithmUtility.intBubbleSort(arr), arr2);
	}

}
