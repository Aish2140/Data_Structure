package Sorting;

import java.util.Scanner;

public class SelectionSort {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		int min;
		int index=-1;
		for (int i = 0; i < arr.length; i++) {
			min = Integer.MAX_VALUE;
			for (int j = i; j < arr.length; j++) {
				if (min > arr[j]) {
					min = arr[j];
					 index=j;

				}

			}
			int temp=arr[i];
			arr[i] = arr[index];
			arr[index]=temp;
			

		}
		for (int i : arr) {
			System.out.println(i + " ");

		}
	}

}
