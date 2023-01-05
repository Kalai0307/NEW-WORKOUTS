package com.practice.patterns;

import java.util.ArrayList;
import java.util.Scanner;

public class OperatorsAndOperands {

	public static void main(String[] args) {

		System.out.println("enter the String");
		Scanner sc = new Scanner(System.in);
		String inputString = sc.next();

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		ArrayList<Character> operators = new ArrayList<Character>();

		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) >= '0' && inputString.charAt(i) <= '9') {
				int num = (int) inputString.charAt(i) - '0';
				numbers.add(num);
			} else {
				operators.add(inputString.charAt(i));
			}

		}
		int answer = calculation(operators, numbers, inputString);
		System.out.println("final answer  :" + answer);

	}

	private static int calculation(ArrayList<Character> operators, ArrayList<Integer> numbers, String inputString) {

		for (int i = 0; i < numbers.size() - 1; i++) {
			int value = 0;
			char operator = operators.get(i);
			switch (operator) {
			case '+': {
				value = numbers.get(i) + numbers.get(i + 1);
				numbers.set(i + 1, value);
				break;
			}
			case '-': {
				value = numbers.get(i) - numbers.get(i + 1);
				numbers.set(i + 1, value);
				break;
			}
			case '*': {
				value = numbers.get(i) * numbers.get(i + 1);
				numbers.set(i + 1, value);
				break;
			}
			case '/': {
				value = numbers.get(i) / numbers.get(i + 1);
				numbers.set(i + 1, value);
				break;
			}

			}
			System.out.println("value    "+value);
			System.out.println(numbers.get(i+1));
			System.out.println(numbers.toString());
		}
int answer=numbers.get(numbers.size()-1);
		return answer;
	}

}
