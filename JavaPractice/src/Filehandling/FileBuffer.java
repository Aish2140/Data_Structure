package Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileBuffer {
	public static void main(String args[])
	{
		String path="C:\\Users\\aishw\\xyz\\Data.txt";
		FileReader reader=null;
		BufferedReader reader2=null;
		int count=0;
		try {
			reader=new FileReader(path);
			reader2=new BufferedReader(reader);
			String line=reader2.readLine();
			System.out.println(line);
		}
		catch(FileNotFoundException e)
		{
			e.getMessage();
		}
		catch(IOException e)
		{
			e.getMessage();
		}
	}
}
