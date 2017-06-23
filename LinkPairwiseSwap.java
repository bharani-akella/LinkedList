package interview;
import java.util.*;
public class LinkPairwiseSwap {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      LinkPairwiseSwap ll=new LinkPairwiseSwap();
      ll.insertFirst(10);
      ll.insertFirst(20);
      ll.insertFirst(30);
      ll.insertFirst(40);
      ll.insertFirst(50);
      ll.insertFirst(60);
      ll.printList();
      ll.pairWiseSwap();
      ll.printList();
	}

	public void pairWiseSwap(){
	    Node temp=head;
	    Node next=null;
	    int mydata=0;
	    while(temp!=null && temp.next!=null){
	    	next=temp.next;
	    	mydata=next.data;
	    	next.data=temp.data;
	    	temp.data=mydata;
	    	temp=next.next;
	    }
	}
	
	public void printList(){
		Node tnode=head;
		if(head==null){
			System.out.println("No elements in the list");
			System.out.println("Insert an element");
			insertFirst(new Scanner(System.in).nextInt());
		}
		while(tnode!=null){
			System.out.print(tnode.data+"->");
			tnode=tnode.next;
		}
		System.out.println("");
	}
	
	public void insertFirst(int d){
		Node n1=new Node(d);
		n1.next=head;
		head=n1;
	}
	
}
