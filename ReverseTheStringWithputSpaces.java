package com.practice.patterns;

import java.util.Scanner;
//2.40--3.00
/*
 * 
 * 
 * abc de
 */

public class ReverseTheStringWithputSpaces {

	public static void main(String[] args) {
		System.out.println("enter input");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int length = word.length() - 1;
		System.out.println("length " + length);
		String reversedOutput = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != ' ') {
				System.out.println(i);
				if (word.charAt(length) != ' ') {
					reversedOutput = reversedOutput + word.charAt(length);
					System.out.println(reversedOutput);
					length--;
				} else {
					length--;
					reversedOutput = reversedOutput + word.charAt(length);
					length--;
				}

			} else {
				reversedOutput = reversedOutput + ' ';
			}

		}
		System.out.println(reversedOutput);

	}

}
