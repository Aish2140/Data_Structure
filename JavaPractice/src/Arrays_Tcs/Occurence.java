package Arrays_Tcs;

import java.util.Scanner;

//Occurance of each element I/P:2 2 2 3 4 5 5 O/p:2-3,3-1,4-1,5-2
public class Occurence {
	public static void printOccur(int[] ar)
	{
		int count=1;
		for(int i=0;i<ar.length-1;i++)
		{
			if(ar[i]==ar[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(ar[i]+"-"+count);
				count=1;
			}
		}
		System.out.println(ar[ar.length-1]+"-"+count);
		
				
			}
	public static void main(String[] args) {
		Scanner scaishu=new Scanner(System.in);
		int n=scaishu.nextInt();
		int ar[]=new int[n];
		for(int i=0;i<ar.length;i++)
		
		{
			ar[i]=scaishu.nextInt();
		}
		printOccur(ar);
	}
		
	}


