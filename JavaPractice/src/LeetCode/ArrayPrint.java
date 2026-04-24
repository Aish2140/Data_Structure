package LeetCode;
import java.util.HashMap;


public class ArrayPrint {
	public static void main(String[] args) {
	int[]nums= {2,7,11,15};
	int k=7;
	for(int i=0;i<nums.length;i++)
	{   
		System.out.print(nums[i]+" ");//printing array
	}
	for(int i=0;i<nums.length;i++)
	{  
		if(nums[i]==k)
		{
		System.out.print("found the k at " +i+ " with value "+nums[i]);
	}
		System.out.println();
	}//finding array element
		for(int i=0;i<nums.length-1;i++)
		{
			for(int j=i+1;j<nums.length;j++)//2 5 7 8 9 target 15
			{
				System.out.println(nums[i]+"  "+nums[j]);			}
		}
		
		
	
	
	

}
}

