package Arrays_Tcs;
//Print all the elements of the array without repeating
public class PrintWithoutRepeating {
	public static void nonRepeat(int arr[])
	{
		for(int i=0;i<arr.length-1;i++) //[2,2,3,4,5,4]
		{
			if(arr[i]==arr[i+1])
			{
			}
			else {
				System.out.println(arr[i]);
			}
		}
		System.out.println(arr[arr.length-1]);
	}

}
