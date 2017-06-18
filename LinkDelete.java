package interview;
import java.util.*;
public class LinkDelete {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);   
		LinkDelete ld=new LinkDelete();
		
		
		 ld.insertFirst(10);
         ld.insertFirst(20);
         ld.insertFirst(30);
         ld.insertFirst(40);
         
		System.out.println("Initial list->"); 
           ld.printList();
           ld.deleteKey(20);
           System.out.println("After deleting 20");
           
           ld.printList();
	}
public void deleteKey(int key){
	Node prev=null,temp=head;
    if(temp!=null && temp.data==key){
    	head=temp.next;
    	return;
    }
    while(temp!=null && temp.data!=key){
    	prev=temp;
    	temp=temp.next;
    }
    if(temp==null){
    	return;
    }
    prev.next=temp.next;
    
}

public void printList(){
     Node tnode=head;
	while(tnode!=null){
	   System.out.println(tnode.data);
       tnode=tnode.next;
	}	
}
public void insertFirst(int d){
	Node first=new Node(d);
    first.next=head;
    head=first;
}

}
