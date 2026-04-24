package Filehandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileFullBufferedRead {
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
			while(line!=null)
			{
				System.out.println(line);
				count++;
				line=reader2.readLine();
			}
			System.out.println(count);
		}catch(FileNotFoundException e)
		{
			e.getMessage();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}

}
}
	
