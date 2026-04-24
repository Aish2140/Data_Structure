package Arrays_Tcs;

import java.util.Scanner;

public class SortedArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr1[]=new int[n];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[n];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		int i=0;
		int j=0;
		while(i<arr1.length&&j<arr2.length)//1
		{
			if(arr1[i]==arr2[j]) {
				System.out.print(arr1[i]+" ");
			i++;
			j++;
			}
			else if(arr1[i]<arr2[j])
			{
				i++;
			}
			else {
				j++;
			}
			
		} 
		
		
	}

}
