package interview;
import java.util.*;
public class LinkPrintReverseUsingRecursion {
Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkPrintReverseUsingRecursion ll=new LinkPrintReverseUsingRecursion();
		ll.head=ll.insertLast(ll.head,10);
		ll.head=ll.insertLast(ll.head,20);
		ll.head=ll.insertLast(ll.head,30);
		ll.head=ll.insertLast(ll.head,40);
		ll.head=ll.insertLast(ll.head,50);
		ll.head=ll.insertLast(ll.head,60);
		ll.head=ll.insertLast(ll.head,70);
		
	ll.traverse(ll.head);
System.out.println("");
	ll.printReverse(ll.head);
		
	}
	
	public void printReverse(Node head){
		if(head==null)return;
		printReverse(head.next);
		System.out.print(head.data+"->");
	}
	
	
	public Node insertLast(Node head,int d){
		Node n1=new Node(d);
		if(head==null){
			head=n1;
			return head;
		}
		Node temp=head;
		while(temp.next!=null){
			temp=temp.next;
		}
		temp.next=n1;
		return head;
	}
	
	public void traverse(Node head){
		Node temp=head;
		while(temp!=null){
			if(temp.next==null){
				System.out.print(temp.data);	
				return;
			}
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

}
