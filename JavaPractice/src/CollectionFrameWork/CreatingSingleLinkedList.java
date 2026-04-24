package CollectionFrameWork;
class Node{
	int data;
	Node next;
	public Node(int data)
	{
		this.data=data;
		this.next=null;
	}
	
}
class Linkedlist{
	Node head;
	public void printList()
	{
		Node curr=head;
	while(curr!=null)
	{
		System.out.println(curr.data);
		curr=curr.next;
	}
	
}
}
public class CreatingSingleLinkedList {
	public static void main(String[] args) {
		Linkedlist li=new Linkedlist();
		Node p1=new Node(10);
		Node p2=new Node(20);
		Node p3=new Node(30);
		p1.next=p2;
		p2.next=p3;
		li.head=p1;
		li.printList();
		
	}
	
	
}