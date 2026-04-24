package PatternProgram;

import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	
		//int n=sc.nextInt();
		goodTriangle(6);


	}

	private static void goodTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=i;j++) {
				if(j==1||i==j)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		/////////////////////////////////////////
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=(n-i);j++)
			{
				if(j==1||j==(n-i))
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}