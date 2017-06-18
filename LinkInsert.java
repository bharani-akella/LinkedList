package interview;

import java.util.*;

public class LinkInsert {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      LinkInsert li=new LinkInsert();
      li.head=new Node(10);
      li.insertFirst(34);
      li.insertFirst(0);
      li.insertLast(89);
      li.insertMid(li.head.next.next.next.next, 23);
      li.insertMid(li.head.next.next.next, 23);
     li.insertLast(100);
      li.printList();
	}
	
	public void insertFirst(int d){
		Node first=new Node(d);
		first.next=head;
		head=first;
	}
	
	public void insertMid(Node prevNode,int d){
		if(prevNode==null){
			System.out.println("Insertion is not possible here");
		return;
		}
		Node mid=new Node(d);
		mid.next=prevNode.next;
		prevNode.next=mid;
	}
	
	public void insertLast(int d){
		if(head==null){
			head=new Node(d);
		return;
		}
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		Node n=new Node(d);
		n.next=null;
		last.next=n;
	}
	
	public void printList(){
	   while(head!=null){
		   System.out.println(head.data);
		   head=head.next;
	   }	
	}
	
	
		}
	


