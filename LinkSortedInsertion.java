package interview;
import java.util.*;
public class LinkSortedInsertion {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkSortedInsertion ll=new LinkSortedInsertion();
	
		ll.insertSort(10);
		ll.insertSort(15);
		ll.insertSort(20);
		ll.insertSort(100);
		ll.insertSort(75);
		ll.insertSort(50);
		ll.insertSort(60);
		ll.insertSort(5);
		ll.traverse();
	
	}
	
	public void insertSort(int d){
		Node n1=new Node(d);
		if(head==null){
			head=n1;
			return;
		}
		if(n1.data<head.data){
			n1.next=head;
			head=n1;
			return;
		}
		Node temp=head;
		Node prev=null;
		while(temp!=null && temp.data<=n1.data){
			prev=temp;
			temp=temp.next;
		}
		if(prev.next==null){
			prev.next=n1;
			return;
		}
		n1.next=temp;
		prev.next=n1;
	}
	
	public void traverse(){
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
