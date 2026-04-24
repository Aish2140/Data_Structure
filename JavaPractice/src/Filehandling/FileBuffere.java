package Filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class FileBuffere {
	public static void main(String args[])
	{
		String path1="C:\\Users\\aishw\\xyz\\Data.txt";
		String path2="C:\\Users\\aishw\\xyz\\tap.txt";
		String path3="C:\\Users\\aishw\\xyz\\Phonebook.txt";
		
		FileReader fr1=null;
		FileReader fr2=null;
		BufferedReader br1=null;
		BufferedReader br2=null;
		FileWriter writer=null;
		try {
			fr1=new FileReader(path1);
			fr2=new FileReader(path2);
			br1=new BufferedReader(fr1);
			br2=new BufferedReader(fr2);
			writer=new FileWriter(path3);
			String Names=br1.readLine();
			String Phone=br2.readLine();
			while(Names!=null)
			{
				System.out.println(Names + ":" + Phone);
				writer.write(Names + " : " + Phone + "\n");
				Names=br1.readLine();
				Phone=br2.readLine();
				
			}
			writer.flush();
		}
		catch(Exception e)
		{
			e.getMessage();
		}

}
}

