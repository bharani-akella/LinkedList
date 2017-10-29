package algo_guru;

public class LinkSwapData {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkSwapData ll=new LinkSwapData();

ll.insertLast(1);
ll.insertLast(2);
ll.insertLast(3);
ll.insertLast(4);


ll.traverse(ll.head);

ll.head=ll.swap(ll.head, 3, 4);

System.out.println("");
ll.traverse(ll.head);

}
	
public void traverse(Node head) {
	Node temp=head;
	while(temp!=null) {
		if(temp.next==null) {
			System.out.print(temp.data);
		}else {
			System.out.print(temp.data+"->");
		}
		
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

public Node swap(Node head,int x,int y) {
	Node currx=head;
	Node curry=head;
	
	while(currx!=null && currx.data!=x) {
		currx=currx.next;
	}
	
	while(curry!=null && curry.data!=y) {
		curry=curry.next;
	}
	
	if(currx==null || curry==null) {
		return head;
	}
	
	int temp=currx.data;
	currx.data=curry.data;
	curry.data=temp;
	return head;
}

}
