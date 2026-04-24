package ExceptionHandling;

import java.util.Scanner;

public class ThrowExample {
	public static void fun1() throws Exception {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a / b;
		System.out.println("Exception caught in fun1");
	}

	
	  public static void fun2() { try { fun1(); }catch(Exception e) {
	  System.out.println("Done.."); }
	  
	  }
	 
	 
	public static void main(String[] args) {
		try {
			fun1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		LinkedList linkedList = new LinkedList();
	}

}
