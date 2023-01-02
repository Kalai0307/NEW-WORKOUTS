package com.practice.patterns;

public class WildCardPattern {
	/*
	 * Text = "baaabab" Pattern = “*****ba*****ab" output : true Pattern ="baaa?ab",
	 * output : true Pattern = "ba*a?", output : true Pattern = "a*ab" , output :
	 * false
	 */
	public static void main(String[] args) {
		String text = "baaabab";
		System.out.println("text      :   " + text);
		String pattern = "ba*a?";
		System.out.println("pattern   :   " + pattern);
		boolean result = wildcard(text, pattern);
		System.out.println("result    :   " + result);
	}

	private static boolean wildcard(String text, String pattern) {
		// System.out.println("creating a matrix including a space col and row");
		// System.out.println(" text is in row side and pattern to be check is in col");
		char textarr[] = text.toCharArray();// converting to char array
		char pattarr[] = pattern.toCharArray();
		boolean check[][] = new boolean[text.length() + 1][pattern.length() + 1];
		check[0][0] = true; // making the first row and col true bcoz (spc == spc) --> true
		for (int i = 1; i < check.length; i++) {
			for (int j = 1; j < check[0].length; j++) {
				if (textarr[i - 1] == pattarr[j - 1] || pattarr[j - 1] == '?') {
					// cond 1: if pattern-->'?' OR same letters ===>>> put the diagonal value
					check[i][j] = check[i - 1][j - 1];
				} else if (pattarr[j - 1] == '*')
				// cond 2: pattern== * means ==>>> top(j-1) OR left side(i-1)
				{
					check[i][j] = check[i][j - 1] || check[i - 1][j];
				} else {
					// cond 3: false
					check[i][j] = false;
				}
			}
		}
		return check[check.length - 1][check[0].length - 1];
	}
}
