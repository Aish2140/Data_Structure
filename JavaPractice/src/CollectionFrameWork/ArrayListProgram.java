package CollectionFrameWork;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListProgram {
	public static void main(String[] args) {
		
	
	//ArrayList<Integer>al=new ArrayList<Integer>(4);
	ArrayList lb=new ArrayList();
	lb.add(11);
	lb.add(12);
	lb.add(13);
	lb.add(40);
	ArrayList al=new ArrayList(4);
	al.add(10);
	al.add(20);
	al.add(30);
	al.add(40);
	al.add(50);
	System.out.println(al.size());
	
   System.out.println(al.add(60));
   al.add(6,70);
   System.out.println(al.add(lb));
   System.out.println(al);
   System.out.println(lb.remove(0));
   System.out.println(al.get(6));
   System.out.println(al.set(6, 35));
   //System.out.println(al.retainAll(lb));
   System.out.println(al);
   System.out.println(al.set(3,3));
   al.trimToSize();
   lb.clear();
   System.out.println(lb);
   System.out.println(al.subList(0,6));
   System.out.println(al.contains(30));
   System.out.println(al.containsAll(lb));
	System.out.println();}
}
