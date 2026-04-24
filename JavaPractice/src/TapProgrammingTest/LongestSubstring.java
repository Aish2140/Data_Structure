package TapProgrammingTest;

import java.util.HashSet;
import java.util.Scanner;

/*You are given a string s. Your task is to find the length of the longest substring that contains no repeating characters. A substring is a contiguous sequence of characters within the string. You must analyze all possible substrings and determine the maximum length among those that have all unique characters.

Input Format
A single string s.

Output Format
Print an integer representing the length of the longest substring without repeating characters.

Sample Inputs & Outputs
Sample Input 1

abcabcbb
Sample Output 1

3
Sample Input 2

bbbbb
Sample Output 2

1*/

public class LongestSubstring {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		longestSub(str);
	}

	private static void longestSub(String str) {
		int max = 0;
		int count = 0;
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.clear();
			for (int j = i; j < str.length(); j++) {
				if (set.contains(str.charAt(j))) {
					if (count > max) {
						max = count;
					}
					count = 0;
					break;
				}
				else {
				set.add(str.charAt(j));
				count++;
				}
			}
		}
		System.out.println(max==0?str.length():max);
	}


}
