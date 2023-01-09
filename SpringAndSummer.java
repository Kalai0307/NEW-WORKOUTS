package com.practice.patterns;

import java.util.Scanner;

public class SpringAndSummer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE NUMBER OF CYCLES");
		Scanner zc = new Scanner(System.in);
		int n = zc.nextInt();
		System.out.println("enter initial height");
		int initiaHeight = zc.nextInt();
		System.out.println(" enter spring height");
		int spring = zc.nextInt();
		System.out.println("enter summer height");
		int summer = zc.nextInt();
		System.out.println("enter the planted season");
		String season = zc.next();
		int val1 = 0;
		int val2 = 0;
		int result = 0;
		if (season.equals("spring")) {
			val1 = spring;
			val2 = summer;
			result = findingHeight(n, val1, val2, initiaHeight);
			System.out.println("resulted height  :" + result);
		} else {
			val1 = summer;
			val2 = spring;
			result = findingHeight(n, val1, val2, initiaHeight);
			System.out.println("resulted height  :" + result);
		}

	}

	private static int findingHeight(int n, int val1, int val2, int initiaHeight) {
		// TODO Auto-generated method stub
		int result = initiaHeight;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				result = result + val2;
			} else {
				result = result + val1;
			}
		}
		return result;
	}

}
