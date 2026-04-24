package TapProgrammingTest;

import java.util.Scanner;
/*Given two sorted arrays, merge them into a single sorted array containing only odd elements in descending order.

📥 Input Format
First line: two integers n and m (sizes of arrays A and B)
Second line: n space-separated integers (array A)
Third line: m space-separated integers (array B)
📤 Output Format
Print space-separated integers (only odd elements in descending order)
🧪 Sample Input
3 3
1 3 5
6 4 2
✅ Sample Output
5 3 1*/


public class MErgeSortinDescendingOrder {
	public static void main(String[] args) {	
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int arr1[]=new int[n];
    for(int i=0;i<n;i++) {
    	arr1[i]=sc.nextInt();
    }
    int arr2[]=new int[m];
    for(int i=0;i<m;i++)
    {
    	arr2[i]=sc.nextInt();
    }
    int output[]=mergeSort(arr1,arr2);
    {
    	for(int i=0;i<output.length;i++)
    	{
    		if(output[i]%2!=0)
    		{
    			System.out.print(output[i]+" ");
    		}
    	}
    }
    
	}

	private static int[] mergeSort(int[] arr1,int[] arr2 ) {
		int i=arr1.length-1;
		int j=0;
		int res[]=new int[arr1.length+arr2.length];
		int k=0;
		while(j<arr2.length) {
			res[k++]=arr2[j++];
		}
		while(i>=0)
		{
			res[k++]=arr1[i--];
		}
		return res;
	}
	
}
