package interface_Package;
interface  Tap{
	void cnsClass();	
}
public class InnerClassExample {
	public static void main(String[] args) {
		class Bkit implements Tap{
			public void cnsClass() {
				System.out.println("cns maam is so good");
			}
		}
		Bkit bkit=new Bkit();
		bkit.cnsClass();
	}
	

}
