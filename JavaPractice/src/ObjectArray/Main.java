package ObjectArray;

public class Main {

	public static void main(String[] args) {
		Customer c1=new Customer();
		c1.cname="aishu";
		System.out.println(c1.cname);
		meth(c1);
		System.out.println(c1.cname);

	}
	public static void meth(Customer c2) {
		System.out.println(c2.cname);
		c2.cname="navii";
		System.out.println(c2.cname);
		
	}

}
