package interview;

public class LinkSwap {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           LinkSwap ll=new LinkSwap();
           ll.insertFirst(1);
           ll.insertFirst(2);
           ll.insertFirst(3);
           ll.insertFirst(4);
           ll.insertFirst(5);
           ll.insertFirst(6);
           ll.printList(ll.head);
           ll.swap(1, 6);
           System.out.println("");
           ll.printList(ll.head);
	}
	
	public void insertFirst(int d){
		Node n1=new Node(d);
		n1.next=head;
		head=n1;
	}
	
	public void printList(Node h) {
		// TODO Auto-generated method stub
                while(h!=null){
                	System.out.print(h.data+"->");
                	h=h.next;
                }
		}
	public void swap(int x,int y){
		if(x==y){
			System.out.println("Cannot swap if both the elements are same");
           return;
		}
		
		Node prevx=null,currx=head;
		while(currx.data!=x && currx!=null){
			prevx=currx;
			currx=currx.next;
		}
		
		Node prevy=null,curry=head;
		while(curry.data!=y && curry!=null){
			prevy=curry;
			curry=curry.next;
		}
		
		if(currx==null || curry==null){
			System.out.println("Element not present; Cannot Swap");
		}
		
		if(prevx!=null){
			prevx.next=curry;
		}else{
			head=curry;
		}
		
		if(prevy!=null){
			prevy.next=currx;
		}else{
			head=currx;
		}
		
		Node temp=curry.next;
		curry.next=currx.next;
		currx.next=temp;
	}
}
