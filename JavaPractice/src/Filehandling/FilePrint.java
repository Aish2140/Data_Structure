package Filehandling;

import java.io.PrintWriter;
import java.io.Writer;
import java.util.Scanner;

public class FilePrint {
	public static void main(String args[])
	{
		String path="C:\\Users\\aishw\\xyz\\Data.txt";
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		float f=sc.nextFloat();
		PrintWriter writer1=null;
		try {
			
			 writer1 = new PrintWriter(path);
			writer1.println(n);
			writer1.println(f);
			writer1.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		}
		


}
