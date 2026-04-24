package Filehandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	public static void main(String args[])
	{
		String path="C:\\\\Users\\\\aishw\\\\xyz\\Data.txt";
		File file=new File(path);
		FileWriter writer;
		try {
			writer = new FileWriter(file);
			writer.write("hello world");
			writer.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
