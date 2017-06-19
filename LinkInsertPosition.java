package interview;

public class LinkInsertPosition {
  Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkInsertPosition ll=new LinkInsertPosition();
		
		ll.insertFirst(1);
		ll.insertFirst(2);
		ll.insertFirst(3);
		ll.insertFirst(4);
		ll.insertFirst(5);
		System.out.println("Initial List");
		ll.printList();
		ll.insertPosition(2,20);
		System.out.println("After insertion of new element");			
		ll.printList();
	}
public void printList(){
	Node tnode=head;
	while(tnode!=null){
		System.out.println(tnode.data);
		tnode=tnode.next;
	}
}

public void insertPosition(int pos,int d){
	Node temp=head;
	Node inode=new Node(d);
	if(pos==0){
		inode.next=head;
		head=inode;
	}
	for(int i=0;temp.next!=null && i<pos;i++){
		temp=temp.next;
	}
	
	inode.next=temp.next;
	temp.next=inode;
}

public void insertFirst(int d){
	Node n1=new Node(d);
	n1.next=head;
	head=n1;
}
}
