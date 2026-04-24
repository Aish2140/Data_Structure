package Arrays_Tcs;

import java.util.Scanner;

public class LargestRepeting {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        int[]arr=new int[n];
	        for(int i=0;i<arr.length;i++)
	        {
	            arr[i]=scanner.nextInt();
	        }
	        int maxcount=1;//1 2 2 2 3 4 
	        int currentElementCount=1;
	        int result=arr[0];
	        for(int i=0;i<arr.length-1;i++)
	        {
	            if(arr[i]==arr[i+1])
	            {
	                currentElementCount++;
	            }
	            else{
	                if(count>maxcount||(count==maxcount&&arr[i]>result))
	                {
	                    maxcount=count;
	                 result=arr[i];   
	                }
	                count=1;
	            }
	        }
	        if(count>maxcount||(count==maxcount&&arr[n-1]>result))
	            result=arr[n-1];

	            System.out.println(result);
	    }
	    }

