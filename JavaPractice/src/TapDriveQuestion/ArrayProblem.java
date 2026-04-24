package TapDriveQuestion;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class ArrayProblem {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int n=scanner.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=scanner.nextInt();
	}
	int k=scanner.nextInt();
	printFactors(arr,k);
	
	}

	private static void printFactors(int[] arr,int k) {
		
		LinkedHashSet<Integer> linkedList = new LinkedHashSet<>();
		for (int i = 0; i < arr.length; i++) {
			linkedList.add(arr[i]);
		}
		for(int num:linkedList)
		{
			if(k%num==0)
				
			{
				System.out.println(num);
			}
			
    		}
    		
	}
	

}
