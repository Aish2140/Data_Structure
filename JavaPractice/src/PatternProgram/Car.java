package PatternProgram;

public class Car {
	String name;
	String colour;
	float cost;
	public static void main(String[] args) {
		Car c1=new Car();
		c1.name="skoda";
		c1.colour="marron";
		c1.cost=1000.0f;
		System.out.println(c1.name);
		Car c2=c1; //pass by reference
		c2.name="ertiga";
		c2.colour="silver";
		c2.cost=1022.0f;
		System.out.println(c2.name); 
		System.out.println(c1.name);
		int a=1000;
		int b = a;//pass by value
		
		System.out.println(a); 
		System.out.println(b);
		b=3000;
		System.out.println(b);
		System.out.println(a);
	}
		

}
