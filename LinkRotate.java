package interview;
import java.util.*;
public class LinkRotate {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
          LinkRotate ll=new LinkRotate();
          ll.insertFirst(50);
          ll.insertFirst(10);
          ll.printList();
          System.out.println("\nHow many nodes are to be rotated?");
          int k=sc.nextInt();
          ll.rotate(k);
          System.out.println("\nAfter rotating anticlockwise by "+ k +" nodes");
         
	}

	public void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
	public void insertFirst(int d){
		
		Node temp=new Node(d);
		temp.next=head;
		head=temp;
		
	}
	
	public void rotate(int k){
		Node temp=head;
		if(k==0){
			printList();
		}
		int i=1;
		while(temp.next!=null){
		    temp=temp.next;	
		}
		Node last=temp;
		temp=head;
		while(i<k && temp!=null ){
			temp=temp.next;
			i++;
		}
		if(temp==null){
			System.out.println("value of count cannot exceed the length of list");
			return;
		}
		if(i==k){
			last.next=head;
			Node next=temp.next;
			temp.next=null;
			head=next;
			printList();	
		}
		
	}
	
}
