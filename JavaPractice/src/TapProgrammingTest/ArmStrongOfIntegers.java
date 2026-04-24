package TapProgrammingTest;
/*📌 Problem

Given an array, print all Armstrong numbers.

👉 Armstrong number = sum of digits^number of digits

📥 Input Format
First line: integer n
Second line: n integers
📤 Output Format
Print Armstrong numbers (each on new line)
If none → No Armstrong numbers found
🧪 Sample Input
5
153 370 371 407 123
✅ Sample Output
153
370
371
407*/

import java.util.Scanner;

public class ArmStrongOfIntegers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scanner.nextInt();
		}
		for(int i=0;i<arr.length;i++)
		{
			if(armStrongNumber(arr[i]))
			{
				System.out.print(arr[i]+" ");
			}
		}
		
		
	}

	private static boolean armStrongNumber(int n) {
		 int count=0;
		 int temp=n;
		 while(temp>0)
		 {
			 temp/=10;
			 count++;
		 }
		 temp=n;
		 if(count==1)
		 {
			 return true;
		 }
		 int sum=0;
		 while(n>0)
		 {
			 int ldr=n%10;
			 sum+=power(ldr, count);
			 n/=10;
		 }
		 if(sum==temp)
		 {
			 return true;
		 
		 
	}
		 return false;
	

}
	public static int power(int base, int exp) {
	    int result = 1;
	    for (int i = 0; i < exp; i++) {
	        result *= base;
	    }
	    return result;
	}
}
