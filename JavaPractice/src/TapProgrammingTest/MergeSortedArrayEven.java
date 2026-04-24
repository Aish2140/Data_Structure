package TapProgrammingTest;

import java.util.Scanner;

public class MergeSortedArrayEven {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m=scanner.nextInt();
		int arr1[] = new int[n];
		int arr2[]=new int[m];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = scanner.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = scanner.nextInt();
		}
		SortedArraysEven(arr1,arr2);
	}

	private static void SortedArraysEven(int[] arr1, int[] arr2) {
		int i=0;
		while(i<arr1.length)
		{
			if(arr1[i]%2==0)
			{
				System.out.print(arr1[i]+" ");
			}
			i++;
		}
		i=0;
		while(i<arr2.length)
		{
			if(arr2[i]%2==0)
			{
				System.out.print(arr2[i]+" ");
			}
		i++;
		}
		
	}

}
