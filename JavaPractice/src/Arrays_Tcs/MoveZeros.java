package Arrays_Tcs;

import java.util.Scanner;

public class MoveZeros {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		moveZero(arr);
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	public static void moveZero(int[]ar) {
	  int i=0;
	  int j=0;
	  while(i<ar.length)
	  {					  i
		  if(ar[i]==0)//0 2 0 3
		  {				j
			  i++;		2 2 0 3
		  }				  j   i
		  else {		  3 0 3
			  ar[j]=ar[i]; 
			  j++;
			  i++;
		  }
	  }
	  while(j<ar.length)
	  {
		  ar[j]=0;
		  j++;
	  }
	  
	}
}
