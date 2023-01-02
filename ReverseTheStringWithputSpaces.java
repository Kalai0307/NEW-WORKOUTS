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
		//System.out.println("length " + length);
		String reversedOutput = "";
		for (int i = 0; i < word.length(); i++) {
			if (word.charAt(i) != ' ') {
				System.out.println(i);
				if (word.charAt(length) != ' ') {
					reversedOutput = reversedOutput + word.charAt(length);
					//System.out.println(reversedOutput);
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
		method_2(word);
	}

	private static void method_2(String word) {
		int start = 0;
		int end = word.length() - 1;
		String result = "";
		char Str[] = word.toCharArray();
		while (start < end) {

			// If character at start or end
			// is space, ignore it
			if (Str[start] == ' ') {
				start++;
				continue;
			} else if (Str[end] == ' ') {
				end--;
				continue;
			}
			// If both are not spaces, do swap
			else {
				char temp = Str[start];
				Str[start] = Str[end];
				Str[end] = temp;
				start++;
				end--;
			}
		}
		System.out.println(String.valueOf(Str));

	}

}
