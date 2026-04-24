package ExceptionHandling;

import java.util.Scanner;

public class StackPropogation {
	public static void fun1() throws ArithmeticException {

		Scanner sc = new Scanner(System.in);
		System.out.println("Connection 4 got established");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = 0;
		try {
			c = a / b;
			System.out.println(c);
		} catch (ArithmeticException e) {

			System.out.println(e);
			throw e;
		} finally {
			System.out.println("Connection 4 got terminated");
		}

	}

	public static void fun2() {
		System.out.println("Connection 3 got established");
		fun1();
		System.out.println("Connection 3 got terminated");
	}

	public static void fun3() {
		System.out.println("Connection 2 got established");
		fun2();
		System.out.println("Connection 2 got terminated ");

	}

	public static void main(String[] args) {
		System.out.println("Connection 1 got established");
		fun3();

		System.out.println("Connection 1 got terminated");

	}
}
