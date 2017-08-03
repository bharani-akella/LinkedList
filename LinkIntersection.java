package interview;
import java.util.*;
public class LinkIntersection {
Node head1;
Node head2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkIntersection ll=new LinkIntersection();
		ll.head1=ll.insertLast(ll.head1,10);
		ll.head1=ll.insertLast(ll.head1,20);
		ll.head1=ll.insertLast(ll.head1,30);
		
		ll.head2=ll.insertLast(ll.head2,20);
		ll.head2=ll.insertLast(ll.head2,30);
		
		Node one=new Node(40);
		Node two=new Node(50);
		
		ll.head1.next.next.next=one;
		ll.head2.next.next=one;
		one.next=two;
		
	ll.traverse(ll.head1);
	System.out.println("");
	ll.traverse(ll.head2);
	System.out.println("");
	
	ll.intersection(ll.head1, ll.head2);
	
	}
	
	public void intersection(Node h1,Node h2){
		int l1=0;
		int l2=0;
		Node temp1=h1;
		Node temp2=h2;
		
		while(temp1!=null){
			l1++;
			temp1=temp1.next;
		}
		
		while(temp2!=null){
			l2++;
			temp2=temp2.next;
		}
		temp1=h1;
		temp2=h2;
		
		if(l1>l2){
			for(int i=0;i<(l1-l2);i++){
				temp1=temp1.next;
			}
		}
		if(l2>l1){
			for(int i=0;i<(l2-l1);i++){
				temp2=temp2.next;
			}
		}
		
		while(temp1!=null && temp1!=temp2){
			temp1=temp1.next;
			temp2=temp2.next;
			
		}
		if(temp1==null){
			System.out.println("No intersection");
			return;
		}
		System.out.println("Intersection node is "+temp1.data);
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
