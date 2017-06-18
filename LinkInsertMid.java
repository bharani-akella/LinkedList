package interview;

import java.util.*;

public class LinkInsertMid {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
      LinkInsertMid ll=new LinkInsertMid();
      ll.head=new Node(10);
      Node n2=new Node(20);
      Node n3=new Node(30);
   
      ll.head.next=n2;
      n2.next=n3;
      System.out.println("Initial List");
      ll.printList(ll.head);
      System.out.println("Enter element you want to insert at third position");
      ll.insertMiddle(n2,sc.nextInt());
      System.out.println("After insertion");
      ll.printList(ll.head);
	}
	
	public void insertMiddle(Node prevNode, int d) {
		// TODO Auto-generated method stub
		 if (prevNode == null)
		    {
		        System.out.println("The given previous node cannot be null");
		        return;
		    }
		Node n4=new Node(d);
		n4.next=prevNode.next;
		prevNode.next=n4;
		
	}

	public void printList(Node h) {
		// TODO Auto-generated method stub
                while(h!=null){
                	System.out.println(h.data);
                	h=h.next;
                }
		}
	}
	


