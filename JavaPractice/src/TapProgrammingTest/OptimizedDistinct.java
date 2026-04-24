package TapProgrammingTest;

import java.util.HashSet;
import java.util.Scanner;

public class OptimizedDistinct {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scanner.nextInt();
		}
		distinctSubArray(arr);
	}

	private static void distinctSubArray(int[] arr) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			set.clear();

			for (int j = i; j < arr.length; j++) {
				if (set.contains(arr[j])) {
					break;
				}

				set.add(arr[j]);

				// print subarray from i to j
				for (int k = i; k <= j; k++) {
					System.out.print(arr[k] + " ");
				}
				System.out.println();
			}
		}
	}

}
