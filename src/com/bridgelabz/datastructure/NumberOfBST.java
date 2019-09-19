/******************************************************************************
 *  Purpose: Program is for Binary search tree
 *
 *  @author  Rishikesh Mhatre
 *  @version 1.0
 *  @since   16-09-2019
 *
 ******************************************************************************/
package com.bridgelabz.datastructure;

public class NumberOfBST {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			System.out.print(i + " : " + countTrees(i) + "\n");
		}

	}

	public static int countTreesRec(int numKeys) {
		if (numKeys <=1) {
            return(1);
        }
        else {
            int sum = 0;
            int left, right, root;
            for (root=1; root<=numKeys; root++) {
                left = countTreesRec(root - 1);
                right = countTreesRec(numKeys - root);
                sum += left*right;
            }
            return(sum);
        }
	}
	public static int countTrees(int n){
        int T[] = new int[n+1];
        T[0] = 1;
        T[1] = 1;
        for(int i=2; i <= n; i++){
            for(int j=0; j <i; j++){
                T[i] += T[j]*T[i-j-1];
            }
        }
        return T[n];
    }

}
