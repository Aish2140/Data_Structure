package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class UserInput {
	public static void main(String args[])
	{
		String path="C:\\\\Users\\\\aishw\\\\xyz\\Data.txt";
		//File file=new File(path);
		FileWriter writer=null;
		Scanner sc=new Scanner(System.in);
		try {
			String s1=sc.next();
			String s2=sc.next();
			String s3=sc.next();
			writer=new FileWriter(path,true);
			writer.write(s1 + " ");
			writer.write(s2 + " ");
			writer.write(s3 + " ");
			writer.flush();
					
		}
		catch(IOException e)
		{
		e.getMessage();
		
	}
		finally {
			sc.close();
			try {
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

}
}
