package com.practice.patterns;

import java.util.Arrays;

public class RepeatedNumToBeAddedAndArrangeZerosTheLast {

	public static void main(String[] args) {
		int arr[] = { 0, 2, 2, 2, 0, 6, 6, 0, 8 };
		int arr2[] = new int[arr.length];
		arr2 = arrangeZerosAtLast(arr);
		for (int i = 0; i < arr2.length; i++) {
			if (arr2[i] != 0) {
				if (arr2[i] == arr2[i + 1]) {
					int val = arr2[i] + arr2[i + 1];
					arr2[i] = val;
					arr2[i + 1] = 0;
					System.out.println(Arrays.toString(arr2));
				}
			}
		}
		arr2 = arrangeZerosAtLast(arr2);
		System.out.println(Arrays.toString(arr2));

	}

	private static int[] arrangeZerosAtLast(int[] arr) {
		int arr2[] = new int[arr.length];
		int index = 0;
		for (int i = 0; i < arr2.length; i++) {
			if (arr[i] != 0) {
				arr2[index] = arr[i];
				index++;
			}
		}
		for (int i = index; i < arr.length; i++) {
			arr2[i] = 0;
		}
		return arr2;
	}

}
