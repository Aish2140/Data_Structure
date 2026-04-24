package CollectionFrameWork;

import java.util.Scanner;
import java.util.TreeSet;

public class SetPracticing {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		removeAndSortNames(n,scanner);
		
		
	}

	private static void removeAndSortNames(int n,Scanner scanner) {
    TreeSet<String>tree=new TreeSet<String>();
    for(int i=0;i<n;i++)
    {
    	tree.add(scanner.nextLine());
    }
    for(String str:tree)
    {
    	System.out.println(str);
    }
	}

}
