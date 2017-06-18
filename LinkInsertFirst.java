package interview;

import java.util.*;

public class LinkInsertFirst {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
      LinkInsertFirst ll=new LinkInsertFirst();
      ll.head=new Node(10);
      Node n2=new Node(20);
      Node n3=new Node(30);
   
      ll.head.next=n2;
      n2.next=n3;
      System.out.println("Initial List");
      ll.printList(ll.head);
      
      System.out.println("Enter the element to be inserted at first position");
     
      ll.push(sc.nextInt());
      System.out.println("After insertion of element");
		ll.printList(ll.head);
      }
	private void push(int d) {
		// TODO Auto-generated method stub
		Node n1=new Node(d);
		n1.next=head;
		head=n1;
		
	}
	public void printList(Node h) {
		// TODO Auto-generated method stub
                while(h!=null){
                	System.out.println(h.data);
                	h=h.next;
                }
		}
	}
	


