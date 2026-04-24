package PatternProgram;

import java.util.Scanner;

public class GcdLcm {
	public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	 // int a=scanner.nextInt();
	 // int b=scanner.nextInt();
	  int n=scanner.nextInt();
//	  System.out.println(findLcm(a,b));
//	  System.out.println(findGcd(a,b));
//	  System.out.println(a*b/(findGcd(a, b)));
	  countNPrime(n);
	
	}

	private static void countNPrime(int n) {
		int count=1;
		int i=2;
		while(count<=n)
		{
			if(checkPrime(i++)){
				System.out.println(i);
				count++;
			}
		}
		
		
     		
	}
	public static boolean checkPrime(int n) {
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

	private static int findGcd(int a, int b) {
		while(a!=0 && b!=0) {
			if(a>b) {
				a=a%b;
			}
			else {
				b=b%a;
			}
		}
		return a>b?a:b;
    		
	}                                            

	private static int findLcm(int a, int b) {   
	int res=Math.max(a, b);
	while(true)
	{
		if(res%a==0&&res%b==0)
		{
			break;
		}
		res++;
	}
	return res;
	
		
	}
	

}
