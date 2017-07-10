package interview;

public class LinkRemoveDuplicates2 {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            LinkRemoveDuplicates2 ll=new LinkRemoveDuplicates2();

            ll.insertFirst(40);

            ll.insertFirst(30);
            
            ll.insertFirst(20);
            ll.insertFirst(20);
            ll.insertFirst(10);
            ll.insertFirst(10);
            System.out.println("Initial List->");
            ll.printList();
            ll.head=ll.remove(ll.head);
            System.out.println("\n\nAfter removing duplicates->");
            ll.printList();
	}
	
	public void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}
	
	public Node remove(Node head){
		Node dummy=new Node(0);
		dummy.next=head;
		Node p=dummy;
		while(p.next!=null){
			Node q=p.next;
			while(q.next!=null && q.next.data==q.data){
				q=q.next;
			}
			
			if(p.next!=q){
				p.next=q.next;
			}else{
				p=p.next;
			}
		}
		
		return dummy.next;
		
	}
	
	public void insertFirst(int d){
		
		Node temp=new Node(d);
		temp.next=head;
		head=temp;
		
	}

}
