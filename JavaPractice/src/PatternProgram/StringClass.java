package PatternProgram;

import java.util.Scanner;

public class StringClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str=scanner.next();
		
		System.out.println(reverseString(str));
	}

	private static String reverseString(String str) {
         StringBuilder stringBuilder = new StringBuilder();	
         for(int i=str.length()-1;i>=0;i--)
         {
        	 char ch=str.charAt(i);
        	 stringBuilder.append(ch);
         }
         return stringBuilder.toString();
	}
	

}
