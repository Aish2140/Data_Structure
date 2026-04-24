package Tap_DSA;

import java.util.Scanner;

public class TwoSumUsing2Pointer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(targetSum(arr, k));
	}

	public static String targetSum(int[] arr, int k) {
		int i = 0;
		int j = arr.length - 1;
		int sum = 0;
		while (i < j) {
			sum = arr[i] + arr[j];
			if (sum == k) {
				return "Yes";
			}
			else if (sum < k) {
				i++;
			} else {
				j--;
			}
		}
		return "No";
	}
}
