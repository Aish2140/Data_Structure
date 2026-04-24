package Filehandling;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ArrayRead {
	public static void main(String args[])
	{
		String path="C:\\Users\\aishw\\xyz\\Data.txt";
		File file=new File(path);
		FileReader reader=null;
		char ar[]=new char[60];
		try {
			reader=new FileReader(file);
			System.out.println(reader.read(ar));
			System.out.println(ar);
		}
		catch(IOException e)
		{
			e.getMessage();
		}
		

}
}
