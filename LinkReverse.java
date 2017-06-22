package interview;

public class LinkReverse {
Node head;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkReverse ll=new LinkReverse();
        ll.insertFirst(10);
        ll.insertFirst(20);
        ll.insertFirst(30);
        ll.insertFirst(40);
        ll.insertFirst(50);
        System.out.println("Initial List->");
        ll.printList();
       ll.head=ll.reverseList(ll.head);
       System.out.println("\nAfter reversing the list");
       ll.printList();
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
	
	public Node reverseList(Node h){
		Node prev=null,next=null,current=h;
		while(current!=null)
		{
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}		
		return prev;
	}
}
