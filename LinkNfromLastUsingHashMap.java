package interview;
import java.util.*;
public class LinkNfromLastUsingHashMap {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkNfromLastUsingHashMap ll=new LinkNfromLastUsingHashMap();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertFirst(50);
		ll.printL();
		System.out.println("");
		ll.printNfromLast(2);
	}
	
	public int length(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void printNfromLast(int k){
	HashMap<Integer, Integer> h=new HashMap<>();
	Node temp=head;
	for(int i=1;temp!=null;i++,temp=temp.next){
		h.put(i, temp.data);
	}
	System.out.println(h.get(length()-k+1)+" is at position "+k+" from last");
	}
	
	
	public void insertFirst(int d){
		Node n1=new Node(d);
		if(head==null){
			head=n1;
			return;
		}
		n1.next=head;
		head=n1;
	}
	
	public void printL(){
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
