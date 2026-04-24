package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyingData {
	public static void main(String args[])
	{
		String path="C:\\Users\\aishw\\xyz\\Data.txt";
		String path2="C:\\Users\\aishw\\xyz\\tap.txt";
		FileWriter writer=null;
		FileReader reader=null;
		try {
		
		    reader=new FileReader(path);
			writer=new FileWriter(path2);
			int c=reader.read();
			while(c!=-1)
			{
				writer.write(c);
				System.out.print((char)c);
				c=reader.read();
				writer.flush();
			}
		}
			catch(IOException e)
			{
				e.getMessage();
			}
		}

}
