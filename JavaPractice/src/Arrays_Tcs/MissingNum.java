package Arrays_Tcs;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		int exptsum=(n+1)*(n+2)/2;//which calculate the 
		int actual_sum=0;
		for(int i=0;i<n;i++)
		{
			actual_sum+=arr[i];
		}
		int missing=exptsum-actual_sum;
		System.out.println(missing);
		
		

	}


}
