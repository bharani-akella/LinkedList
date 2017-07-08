package interview;
import java.util.Scanner;
public class LinkRemoveDuplicate {
Node head;

public static void main(String[] args) {
	// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);   
	LinkRemoveDuplicate ll=new LinkRemoveDuplicate();
	
	
	 ll.insertFirst(30);
     ll.insertFirst(30);
     ll.insertFirst(30);
     ll.insertFirst(30);
     ll.insertFirst(40);
     ll.insertFirst(40);
     ll.insertFirst(40);
     ll.insertFirst(40);
     
	System.out.println("Initial list->"); 
       ll.printList();
       System.out.println("\nAfter removing duplicates->"); 
       ll.duplicateRemover();
       ll.printList();
     
}

public void duplicateRemover(){
	Node temp=head;
	Node next_next;
	while(temp.next!=null){
	       	if(temp.data==temp.next.data){
	       		next_next=temp.next.next;
	       		temp.next=next_next;
	       	}else{
	       		temp=temp.next;
	       	}
	}
}

	public void printList(){
	     Node tnode=head;
		while(tnode!=null){
		   System.out.print(tnode.data+"->");
	       tnode=tnode.next;
		}	
	}
	public void insertFirst(int d){
		Node first=new Node(d);
	    first.next=head;
	    head=first;
	}
	
}
