package interview;

import java.util.*;

public class LinkInsertLast {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
      LinkInsertLast ll=new LinkInsertLast();
      ll.head=new Node(10);
      Node n2=new Node(20);
      Node n3=new Node(30);
   
      ll.head.next=n2;
      n2.next=n3;
      System.out.println("Initial List");
      ll.printList(ll.head);
      System.out.println("Enter element you want to insert at last position");
      ll.insertLast(sc.nextInt());
      System.out.println("After insertion");
      ll.printList(ll.head);
	}
	
	public void insertLast(int d) {
		// TODO Auto-generated method stub
		Node n4=new Node(d);
		
		if(head==null){
			 head=new Node(d);
		return; 
		}
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		n4.next=null;
		last.next=n4;
		return;
	}

	public void printList(Node h) {
		// TODO Auto-generated method stub
                while(h!=null){
                	System.out.println(h.data);
                	h=h.next;
                }
		}
	}
	


