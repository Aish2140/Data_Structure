package Filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String args[])
	{
		String path="C:\\Users\\aishw\\xyz\\Data.txt";
		File file=new File(path);
		FileReader reader=null;
		try {
			reader=new FileReader(file);
			System.out.println((char)reader.read());
		}
		catch(IOException e)
		{
		e.getMessage();
	    }

		
	}

}
