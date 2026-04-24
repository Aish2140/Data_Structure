package TapProgrammingTest;

import java.util.Scanner;

/*Given a numeric string S and number k, count how many times k appears in S.
❗ Overlapping NOT allowed

📥 Input Format
First line: string S
Second line: number k
📤 Output Format
Print count of occurrences
🧪 Sample Input
123456123123
123
✅ Sample Output
3*/
public class OccurenceOfNumberString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1=scanner.next();
		String str2=scanner.next();
		System.out.println(matchTheString(str1,str2));
	}

	private static int matchTheString(String str1, String str2) {
		int len=str2.length();
		 int count=0;
		for(int i=0;i<=str1.length()-len;i++)
		{
			if(str1.substring(i,i+len).equals(str2)) {
				count++;
				i+=len-1;//skip the i  iteration when u find the substring beacuse it
				         //prevents overlapping ex:1111 o/p should be 2 not 3
			}
		}
		return count;
	   
	}
	

}
