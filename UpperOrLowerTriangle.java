package com.practice.patterns;

public class UpperOrLowerTriangle {

	public static void main(String[] args) {
//		int a[][] = { { 1, 2, 3 }, { 0, 2, 3 }, { 0, 0, 3 }
//
//		};
		// int a[][] = { { 0,0 }, {1,0}};
		int a[][] = { { 1, 4, 0 }, { 2, 3, 0 }, { 0, 0, 0 } };
		if (check(a, 1, a.length)) {
			System.out.println("upper triangle");
		} else {
			System.out.println("lower triangle");
		}

	}

	private static boolean check(int[][] a, int i, int length) {

		for (i = 1; i < length; i++) {
			for (int j = 0; j < i; j++) {
				if (a[i][j] != 0) {
					return false;
				}
			}
		}
		return true;
	}

}
