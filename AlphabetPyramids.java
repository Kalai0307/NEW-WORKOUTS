package com.practice.patterns;

//3.04--3.16
import java.util.Scanner;

public class AlphabetPyramids {

	public static void main(String[] args) {
		System.out.println("enter number of alphabet");
		Scanner sc = new Scanner(System.in);
		String letter=sc.next().toUpperCase();
		char end = letter.charAt(0);
		int limit = (int) end - 'A';
		System.out.println(limit);
		for (int i = limit; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print((char) ('A' + j));
			}
			System.out.println();
		}
		for (int i = 0; i <= limit; i++) {
			for (int j = 0; j <= i; j++)
			{
				System.out.print((char) ('A' + j));
			}
			System.out.println();
		}
	}
}
