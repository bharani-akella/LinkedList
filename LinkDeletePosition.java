package interview;
import java.util.Scanner;
public class LinkDeletePosition {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         LinkDeletePosition ll=new LinkDeletePosition();
         ll.insertFirst(1);
         ll.insertFirst(2);
         ll.insertFirst(3);
         ll.insertFirst(4);
         System.out.println("Initial List->");
         ll.printList();
         ll.deleteKey(0);
         System.out.println("After deleting first element");
        ll.printList();
        ll.deleteKey(2);
        System.out.println("After deleting last element");
        ll.printList();
        
	}
public void  printList(){
	Node tnode=head;
	while(tnode!=null){
		System.out.println(tnode.data);
		tnode=tnode.next;
	}
}

public void insertFirst(int d){
     Node n1=new Node(d);
     n1.next=head;
     head=n1;
}

public void deleteKey(int pos){
  Node	temp=head;
  Node n1=null;
  if(pos==0 && temp!=null){
	  head=temp.next;
  }
  for(int i=0;i<(pos-1) && temp!=null;i++){
	  temp=temp.next;
	  
  }
  if(temp==null && temp.next==null){
	  System.out.println("cannot insert here");
  return;
  }
  n1=temp.next.next;
  temp.next=n1;
}

}
