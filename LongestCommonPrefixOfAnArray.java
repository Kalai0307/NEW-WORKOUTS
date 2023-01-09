package com.practice.patterns;

import java.util.Scanner;

public class LongestCommonPrefixOfAnArray {

	public static void main(String[] args) {

		System.out.println("enter array size");
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String words[] = new String[size];
		for (int i = 0; i < size; i++) {
			words[i] = sc.next();
		}
		String smallestWord = FindSmallestWord(words);
		System.out.println(smallestWord);
		String result = longestCommonPrefix(smallestWord, words);
		System.out.println("result    :" + result);

	}

	private static String longestCommonPrefix(String smallestWord, String[] words) {
		String result = "";
		boolean flag = true;
		for (int i = 0; i < smallestWord.length(); i++) {
			char letter = smallestWord.charAt(i);
			for (int j = 0; j < words.length; j++) {
				if (words[j].charAt(i) != letter) {
					flag = false;
				}
			}
			if (flag) {
				result = result + letter;
			} else {
				return result;
			}
		}
		return result;

	}

	private static String FindSmallestWord(String[] words) {
		String word = words[0];
		for (int i = 0; i < words.length; i++) {
			if (word.length() > words[i].length()) {
				word = words[i];
			}
		}

		return word;
	}

}
