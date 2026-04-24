package Arrays_Tcs;

import java.util.Scanner;

public class Arrays {
	
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr1[] = new int[n];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int arr2[] = new int[m];
        for (int j = 0; j < arr2.length; j++) {
            arr2[j]=sc.nextInt();
        }
        int o=sc.nextInt();
        int arr3[] = new int[o];
        for(int k=0;k<arr3.length;k++)
        {
            arr3[k]=sc.nextInt();

        }
        for (int i : arrayMerge(arr1, arr2, arr3)) {
			System.out.print(i+" ");
		}
       

    }
	public static int[] arrayMerge(int[]arr1,int[]arr2,int[]arr3)
	{					//1 2 3 4		//5 6 7		9 10 15
		int res[]=new int[arr1.length + arr2.length + arr3.length];
		int k=0;
		int i=0;
		int j=0;
		int z=0;
		while(i<arr1.length)
		{
			res[k++]=arr1[i++];
		}
		while(j<arr2.length)
		{
			res[k++]=arr2[j++];
		}
		while(z<arr3.length)
		{
			res[k++]=arr3[z++];
		}
		return res;
	}
}



