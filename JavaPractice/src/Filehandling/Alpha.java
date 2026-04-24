package Filehandling;
import java.io.File;
import java.io.IOException;


public class Alpha {
	public static void main(String args[])
	{
	String path = "C:\\Users\\aishw\\xyz";
	File file = new File(path);
//	System.out.println(file.exists());
//	System.out.println(file.canRead());
//	System.out.println(file.canWrite());
//	System.out.println(file.isFile());
//	System.out.println(file.isDirectory());
//	System.out.println(file.getName());
//	System.out.println(file.getParent());
//	System.out.println(file.getAbsolutePath());
//	System.out.println(file.getAbsoluteFile());
	try {
	file.createNewFile();
	}
	catch(IOException e) {
		System.out.println(e.getStackTrace());
	}
	String[] myFile = file.list();
			for(String myfile:myFile)
			{
				System.out.println(myfile);
			}
			
	
	
	
	
	}

}
