package interview;

public class LinkSwapPair {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkSwapPair obj=new LinkSwapPair();
//obj.insertFirst(50);
obj.insertFirst(40);
obj.insertFirst(30);
obj.insertFirst(20);
obj.insertFirst(10);

obj.printList();
System.out.println("");
obj.head=obj.swap(obj.head);
obj.printList();

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
	
	public Node swap(Node head){
		
		Node p=head;
		Node new_start=head.next;
		Node q;
		Node temp;
		while(true){
			q=p.next;
			temp=q.next;
			q.next=p;
			
			if(temp==null || temp.next==null){
				p.next=temp;
				break;
			}
			
			p.next=temp.next;
			p=temp;
		}
		
		return new_start;
		
	}	
}
