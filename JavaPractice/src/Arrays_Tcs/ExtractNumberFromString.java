package Arrays_Tcs;

import java.util.Scanner;

public class ExtractNumberFromString {
		public static void extractLargestNumber(String sentence) {
		String[] words=sentence.split (" ");
		int max=0;
		for (String word:words)
		{
			
			if(word.matches("\\d+"))
			{
				
			if(!word.contains("9"))
				{
				int num=Integer.parseInt(word);
				if(num>max) {
					max=num;	
				}
				}
			}
			
			
		}
		System.out.println(max);

}
		
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String sentence=sc.nextLine();
	extractLargestNumber(sentence);
	
}
	
}		
