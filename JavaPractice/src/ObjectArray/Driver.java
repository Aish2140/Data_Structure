package ObjectArray;

import java.util.Scanner;

public class Driver {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
		Customer c[]=new Customer[n];
		for(int i=0;i<c.length;i++) {
		c[i]=new Customer();
		System.out.println("Enter the customer id: ");
		c[i].cid=sc.nextInt();
		System.out.println("Enter the customer name: ");
		c[i].cname=sc.next();
		System.out.println("Enter the customer order: ");
		c[i].cprice=sc.nextFloat();
		//System.out.println(c[i].cid + " "+ c[i].cname +" "+ c[i].cprice);
		
		}
		System.out.println("___CID____CNAME____CORDER_____");
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i].cid + "          "+ c[i].cname +"           "+ c[i].cprice);
			System.out.println("__________________________________");
		}
	
		
}
}

