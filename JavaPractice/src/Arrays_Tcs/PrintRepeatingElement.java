package Arrays_Tcs;

import java.util.Scanner;

public class PrintRepeatingElement {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
//		int count=1;
//		for(int i=0;i<arr.length-1;i++)
//		{
//			if(arr[i]==arr[i+1])
//			{
//				count++;
//			}
//			else {
//				if(count==1)
//				{
//					System.out.print(arr[i]+" ");
//				}
//				count=1;
//			}
//		}
//		if(count==1)
//		{
//			System.out.print(arr[arr.length-1]);
//		}
		int printed=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i+1]&&arr[i]!=printed)
			{
			 System.out.print(arr[i]+" ");
			 printed=arr[i];
			}

			}
			
		}
		
		
	}
	


