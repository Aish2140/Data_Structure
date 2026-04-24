package interface_Package;

 class ParentClass {
	public static void Parent() {
		System.out.println("parent is eating...");
	}
}
	 class Child extends ParentClass{
		public static void Parent() {
			System.out.println("Child is eating...");
		}
	}
	public class MethodHiding{
		public static void main(String[] args) {
			
		
		ParentClass p;
		Child ch=new Child();
	   p=ch;
		p.Parent();
	}
	}


