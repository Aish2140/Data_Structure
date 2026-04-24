package TapProgrammingTest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctSubArray {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		distinctMergeSort(arr);
	}

	private static void distinctMergeSort(int[] arr) {
		for (int len = 1; len <= arr.length; len++) {
			for (int i = 0; i <= arr.length - len; i++) {
				HashSet set = new HashSet<>();
				boolean repeat = true;

				for (int j = i; j < i + len; j++) {
					if (set.contains(arr[j])) {
						repeat = false;
						break;                 // break → stops current loop when duplicate found
						                      // ensures subarray has only distinct elements
						// outer loop continues with next starting index
					} else {
						set.add(arr[j]);

					}
				}
     
				if(repeat)
				 {
					for (int j = i; j < i + len; j++) {
						System.out.print(arr[j] + " ");
					}
					System.out.println();
					
				 }
			}
		}
	}
}
