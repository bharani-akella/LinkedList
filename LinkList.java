package interview;

import java.util.*;

public class LinkList {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
      LinkList ll=new LinkList();
      ll.head=new Node(10);
      Node second=new Node(20);
      Node third=new Node(30);
      
      ll.head.next=second;
      second.next=third;
      
      ll.printList();
      }
	public void printList() {
		// TODO Auto-generated method stub
		Node h=head;
		while(h!=null){
			System.out.println(h.data);
			h=h.next;
		}
	}
	}


