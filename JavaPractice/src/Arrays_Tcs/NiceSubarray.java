package Arrays_Tcs;

import java.util.Scanner;

public class NiceSubarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int k=sc.nextInt();
		int max=0;
		
		for(int len=k;len<=arr.length;len++) {
			for(int i=0;i<=arr.length-len;i++) {
				int oddCount=0;
				for(int j=i;j<i+len;j++) {
					if(arr[j]%2!=0) {//1 1 2 1 1]
						oddCount++;
					}
				}
				if(oddCount==k)
					max++;
			}
		}
		System.out.println(max);
	}

}
