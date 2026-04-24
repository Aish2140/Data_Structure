package Arrays_Tcs;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String input=sc.nextLine();
	char[] str=new char[input.length()];
	int j=0;
	for(int i=input.length()-1;i>=0;i--)
	{
		//t=t+input.charAt(i);
		str[j]=input.charAt(i);
		j++;
		
	}
	String str1=new String(str);
	
	if(input.equals(str1))
	{
		System.out.println("True");
	}
	else {
		System.out.println("False");
	}
	Character.is
	

}
}
