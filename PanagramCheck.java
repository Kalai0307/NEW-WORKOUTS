package com.practice.patterns;

import java.util.Arrays;
import java.util.Scanner;

//3.21-- 3.45
public class PanagramCheck {
//abcdefghijklmnopqrstuvwxyz
	// Bawds jog,flick Quartz,vex nymph
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String sentence = sc.nextLine();
		int length = sentence.length();
		System.out.println("lngth  " + length);
		boolean check = checkPanagram(sentence, length);
		System.out.println(check);

	}

	private static boolean checkPanagram(String sentence, int length) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26 };
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {
				int index = (int) sentence.charAt(i) - 'A';
				// System.out.println(index);
				if (array[index] != 0) {
					array[index] = 0;
					count++;
				}
			} else if (sentence.charAt(i) >= 'a' && sentence.charAt(i) <= 'z') {
				int index = (int) sentence.charAt(i) - 'a';
				// System.out.println(index);
				if (array[index] != 0) {
					array[index] = 0;
					// count++;
				}
			}

		}
		System.out.println(Arrays.toString(array));
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				return false;
			}
		}
		return true;
//		System.out.println("count  " + count);
//		if (count == 26) {
//			return true;
//		} else {
//			return false;
//		}

	}

}
