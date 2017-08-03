package interview;
import java.util.*;
public class CheckLoopUsingHashMap {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckLoopUsingHashMap ll=new CheckLoopUsingHashMap();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertFirst(50);
		ll.head.next.next.next.next.next=ll.head.next.next;
		ll.checkLoop();
	
	}
	
	public void checkLoop(){
		Node temp=head;
		HashMap<Node, Integer> h=new HashMap<Node,Integer>();
		while(temp!=null){
			if(!h.containsKey(temp)){
				h.put(temp, 0);
			}else{
				System.out.println("Loop present");
				return;
			}
			temp=temp.next;
		}
		if(temp==null){
			System.out.println("Null terminated");
			return;
		}
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
