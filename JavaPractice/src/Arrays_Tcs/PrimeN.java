package Arrays_Tcs;

import java.util.Scanner;

public class PrimeN {
 public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int n=sc.nextInt();
	 int count=0;
	 for(int i=2;count<=n;i++)
	 {
		 if(prime(i)==true)
		 {
			 System.out.print(i+" ");
			
		 }
		 count++;
	 }
	 
	
}
 public static boolean prime(int n)
 {
	 for(int i=2;i*i<n;i++)
	 {
		 if(n%i==0)
		 {
			 return false;
		 }
	 }
	 return true;
 }
 

}
