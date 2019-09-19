package com.bridgelabz.cohortproblems;

public class ProblemAlternate {

	public static void main(String[] args) {
		String str = "abzzba";
		char[] ch = str.toCharArray();
		boolean isMatched = false;
		for (int i = 0; i < ch.length; i = i + 2) {
			if (ch[i] == ch[i + 1]) {
				isMatched = true;
				break;
			}
		}
		if (isMatched) {
			System.out.println("Match found false");
		} else
			System.out.println("Match not found true");

	}

}
