package interview;

public class LinkNfromLast2 {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkNfromLast2 ll=new LinkNfromLast2();
		ll.insertFirst(10);
		ll.insertFirst(20);
		ll.insertFirst(30);
		ll.insertFirst(40);
		ll.insertFirst(50);
		ll.printL();
		System.out.println("");
		ll.printN(1);
	}
	
	public int length(){
		Node temp=head;
		int count=0;
		while(temp!=null){
			count++;
			temp=temp.next;
		}
		return count;
	}
	
	public void printN(int k){
		Node ref=head;
		Node main=head;
		if(k<=0){
			System.out.println("index value cannot be zero or negative");
			return;
			
		}
		if(k>length()){
			System.out.println("index value exceeds length of list");
			return;
		}
		for(int i=0;i<k;i++){
			ref=ref.next;
		}
		while(ref!=null){
			ref=ref.next;
			main=main.next;
		}
		System.out.println(main.data+" is at position "+k+" from last");
	}
	public void insertFirst(int d){
		Node n1=new Node(d);
		if(head==null){
			head=n1;
			return;
		}
		n1.next=head;
		head=n1;
	}
	
	public void printL(){
		Node temp=head;
		while(temp!=null){
			if(temp.next==null){
				System.out.print(temp.data);	
				return;
			}
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

}
