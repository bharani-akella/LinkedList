package interview;
import java.util.Scanner;
public class LinkedList {
Node head;

static class Node{
	int data;
	Node next;
	
	Node(int d){
		data=d;
		next=null;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
		LinkedList ll=new LinkedList();
		System.out.println("Enter the first element");
		ll.head=new Node(sc.nextInt());
		
		System.out.println("Enter the second element");
		 Node second=new Node(sc.nextInt());
       
		 System.out.println("Enter the third element");
		 Node third=new Node(sc.nextInt());
		 
		 ll.head.next=second;
		 second.next=third;
		 
		 ll.printList();
	}
	
	public void printList(){
		Node h=head;
		System.out.println("The Linked List elements are");
		while(h!=null){
			System.out.println(h.data);
			h=h.next;
		}
	}

}
