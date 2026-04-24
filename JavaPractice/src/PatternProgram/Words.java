package PatternProgram;


import java.util.Scanner;

public class Words {
	public static int countWord(String s) {
		int count=0;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ') {
				count++;
			}
		}
		return s.charAt(0)==' '?count:count+1;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println(countWord(s));
	}

}
