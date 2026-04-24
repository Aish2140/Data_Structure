package interface_Package;

public class Functional_Interface {
	public static void main(String[] args) {
//	   Cat cat=new Cat();
//		cat.bark();
		Dog dog=new Dog();
		//Cat cat=new Cat();
		dog.cat.bark();
		
	}
}
	@FunctionalInterface
	interface Animal{
		void bark();
		public default void makeSound() {
			System.out.println("All animals makes sound..");
		}
	}	

//class Cat implements Animal{
//	public void bark() {
//		System.out.println("cat donot bark...");//regular class implimentation
//	}
//}
class Dog{

	Cat cat=new Cat();
	class Cat implements Animal{
		public void bark() {
			System.out.println("cat donot bark...");//regular class implimentation
		}
	
}
}
