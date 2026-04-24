package LeetCode;

import java.util.HashMap;
import java.util.Scanner;

public class Hm {

	public static void main(String[] args) {
		HashMap<Integer,Integer>num=new HashMap<>();
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
			num.put(arr[i], i);
			
			
		}
		System.out.println(num+" ");
		System.out.println(num.containsKey(5));
		if(num.containsKey(5))
		{
			System.out.println(num.get(5));
		}
		
	
	}

}
