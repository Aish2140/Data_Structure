package CollectionFrameWork;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList le=new LinkedList();
		le.add(10);
		le.add(20);
		le.add(30);
		le.add(40);
		//le.add(5, 4);
		System.out.println(le);
		System.out.println(le.peek());
		System.out.println(le.peekFirst());
		
	}

}
