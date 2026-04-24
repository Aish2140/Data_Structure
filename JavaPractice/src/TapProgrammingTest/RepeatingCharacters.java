package TapProgrammingTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;


/*🔹 Question 5: Repeating Characters
📌 Problem

Identify repeating characters in a word.

📤 Output Rules
One repeating → "x is repeating"
Multiple → "x and y are repeating"
None → "non-repeating"
📥 Input
programming
✅ Output
r and g and m are repeating*/


public class RepeatingCharacters {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		RepeatingChar(str);
	}

	private static void RepeatingChar(String str) {
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		String t = "";
		Set<Character> key = map.keySet();
		for (char car : key) {
			int val = map.get(car);
			if (val >= 2) {
				t = t + car;
			}
		}
		if (t.length() == 0) {
			System.out.println("non-repeating");
		}
		else if(t.length()==1) {
				System.out.println(t+" is repeating");
			
			}
			else {
			for (int i = 0; i < t.length(); i++) {
				char ch=t.charAt(i);
					if(i>0) {
						System.out.print(" and ");
					}
					System.out.print(ch);
			
			}
			System.out.print(" are repeating");
		}

	}

}
