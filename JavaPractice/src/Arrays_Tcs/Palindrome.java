package Arrays_Tcs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	System.out.println(palindromeCheck(input));
}
 public static boolean palindromeCheck(String input)
 {

	int i=0;
	int j=input.length()-1;
	while(i<j)
	{
		if(input.charAt(i)!=input.charAt(j))
		{
			return false;
				
		}
		i++;
		j--;
	}
	return true;

}
}
