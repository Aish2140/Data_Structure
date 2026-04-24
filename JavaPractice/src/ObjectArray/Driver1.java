package ObjectArray;

import java.util.Scanner;

public class Driver1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Dog d[]=new Dog[n];
		for(int i=0;i<d.length;i++)
		{
			d[i]=new Dog();
			System.out.println("Enter the name of the Dog: ");
			d[i].name=sc.next();
			System.out.println("Enter the age of the Dog: ");
			d[i].age=sc.nextInt();
			System.out.println("Enter the breed of the Dog: ");
			d[i].breed=sc.next();
			System.out.println("Enter the color of the Dog: ");
			d[i].color=sc.next();
			
			
			
		}
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i].name+" "+d[i].age+" "+d[i].breed+" "+d[i].color);
		}
		
		
	}

}
