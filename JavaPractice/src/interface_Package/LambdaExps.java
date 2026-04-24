package interface_Package;
interface naveen{
	void likesWhom();
}

public class LambdaExps {
	public static void main(String[] args) {
		naveen n=()->{
			System.out.println("naveen likes every girls");
		};
		n.likesWhom();
	}
	

}

