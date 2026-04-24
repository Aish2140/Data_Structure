package interface_Package;

interface Subject{
	void myFavSub();
}

public class AnonymousInnerClass {
	public static void main(String[] args) {
	 Subject sub=new Subject()
	 {
		public void myFavSub() {
			 System.out.println("my fav subject is java");
		 }
	 };
      sub.myFavSub();
}
}
