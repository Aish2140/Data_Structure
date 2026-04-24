package Arrays_Tcs;

import java.util.Scanner;

public class RearrangeTheArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int res[] = rearrangeArray(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + "");
		}

	}

	public static int[] rearrangeArray(int arr[]) {
		int i = arr.length - 1;
		int j = arr.length - 1;
		while (i >= 0) {
			if (arr[i] == -1) {
				i--;
			} else {
				arr[j] = arr[i];
				i--;
				j--;
			}
		}
		while (j >= 0) {
			arr[j] = -1;
			j--;
		}
		return arr;

	}

}
