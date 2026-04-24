package TapProgrammingTest;
/*📌 Problem
Question 4: All Prime Product Subarrays
📌 Problem

Find all subarrays:

Length > M
Product is a prime number
📥 Input Format
First line: N M
Second line: N integers
📤 Output Format
Print each valid subarray
If none → None
🧪 Sample Input
5 1
1 2 3 4 5
✅ Sample Output
1 2

*/

import java.util.Scanner;

public class PrimeSubArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int arr[]=new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=scanner.nextInt();
		}
		primeSubArray(arr,m);
	}

	private static void primeSubArray(int[] arr,int len){
		
		for(int i=0;i<arr.length;i++) {
			int mul=1;
			for(int j=i;j<arr.length;j++)
			{
				mul*=arr[j];
			
			if((j-i+1)>len&&checkPrime(mul)) {
				for(int k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}
		}
		 
	
	}
	public static boolean checkPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	

}
