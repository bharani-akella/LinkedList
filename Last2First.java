package algo_guru;

public class Last2First {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Last2First ll=new Last2First();

ll.insertLast(1);
ll.insertLast(2);
ll.insertLast(3);
ll.insertLast(4);
ll.insertLast(5);
ll.insertLast(6);
ll.insertLast(7);
ll.insertLast(8);
ll.insertLast(9);
ll.insertLast(0);

ll.traverse(ll.head);


System.out.println("");

ll.head=ll.lastToFirst(ll.head);
ll.traverse(ll.head);
	}

	public void traverse(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

	public void insertLast(int d) {
		Node n1=new Node(d);
		if(head==null) {
			head=n1;
			return;
		}
		
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=n1;
		
	}

	public Node firstToLast(Node head) {
		if(head==null)return null;
		
		Node last=head;
		Node prev=null;
		while(last.next!=null) {
			prev=last;
			last=last.next;
		}
		
		prev.next=last.next;
		last.next=head;
		head=last;
		return head;
	}
	
}
