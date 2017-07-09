package interview;

public class ListPalindrome {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListPalindrome ll=new ListPalindrome();
		ll.insertFirst(10);
		ll.insertFirst(10);
		ll.insertFirst(19);
		ll.insertFirst(10);
		
		ll.printList(ll.head);
		
	boolean result=	ll.isPalindrome(ll.head);
	if(result==true){
		System.out.println("Given list is palindrome");
	
	}else{

		System.out.println("Given list is not palindrome");
	
	}			
		}
	
	public Node reverse(Node head){
		Node current=head;
		Node prev=null;
		Node next=null;
		while(current!=null){
			next=current.next;
			current.next=prev;
			prev=current;
			current=next;
		}
		return prev;
	}
	
	public boolean isPalindrome(Node head){
		Node p,q,start_first,start_second;
		p=head;
		q=head;
		start_first=head;
		
		if(p.next==null){
			return true;
		}
		while(true){
			p=p.next.next;
			if(p==null){
				start_second=q.next;
				break;
			}
			if(p.next==null){
				start_second=q.next.next;
				break;
			}
			
			q=q.next;
		}
		q.next=null;
		start_second=reverse(start_second);
		while(start_first!=null && start_second!=null){
			if(start_first.data==start_second.data){
				start_first=start_first.next;
				start_second=start_second.next;
			}else{
			
			return false;
			}
			
		}
		return true;
		
	} 
		
	public void printList(Node head) {
		// TODO Auto-generated method stub
		Node h=head;
		while(h!=null){
			System.out.print(h.data+" ");
			h=h.next;
		}
	}
	
	private void insertFirst(int d) {
		// TODO Auto-generated method stub
		Node n1=new Node(d);
		n1.next=head;
		head=n1;
		
	}

}
