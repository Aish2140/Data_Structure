package com.Library.Management;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in); 
		System.out.println("Enter the number of books: ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Book b[]=new Book[n];
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Book();
			System.out.println("Enter the title of the book: ");
			b[i].title=sc.nextLine();
			System.out.println("Enter the author of the book: ");
			b[i].author=sc.nextLine();
			System.out.println("Enter the price of the book: ");
			b[i].price=sc.nextFloat();
			sc.nextLine();
			}
		System.out.println("Enter the name of the author to find the book:");
			String find=sc.nextLine();
			searchBook(b, find);
		
	}
	public static void searchBook(Book []b,String find) {
		for(int i=0;i<b.length;i++)
		{
			if(b[i].author.equalsIgnoreCase(find))
			{    System.out.println("Book found...");
				System.out.println(b[i].author+" "+b[i].title+" "+b[i].price);
			}
				
	}
	}
}


