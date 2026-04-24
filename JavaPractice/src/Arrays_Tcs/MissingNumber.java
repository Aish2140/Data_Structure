package Arrays_Tcs;

import java.util.Scanner;

public class MissingNumber {

	public static void missing(int arr[])
	{
		//Target set to 1 
		int target=1;
		//to keep track if the value is present
		int count=0;
		//feeding 1 to arr.length numbers to the for loop to check if the target is present
		while(target<=arr.length) {
			//reseting count after each target is compared with all the array elements
			count=0;
			//to traverse through the array
		for(int i=0;i<arr.length;i++)    //[2,3,1,5,6] n*(n+1)/2
		{
		//checking if the array elements matches with the already set target value
			if(arr[i]==target)
				count++;//increasing the count if the target found
							
		}
		if(count==0)//when the target not found across the array count does not increase
		{
			System.out.println(target);//print the missing target value within the array
		}
		target++;//moving on to the next target
		}
		
	}
	
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
	   missing(arr);
	   
	}
 
}
