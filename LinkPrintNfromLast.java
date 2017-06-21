package interview;

public class LinkPrintNfromLast {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkPrintNfromLast ll=new LinkPrintNfromLast();
ll.insertFirst(12);
ll.insertFirst(8);
ll.insertFirst(45);
ll.insertFirst(34);
ll.insertFirst(23);
ll.insertFirst(243);
ll.printList();
ll.printNfromLast(2);
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
	
	public void printNfromLast(int n){
		Node temp=head;
		int len=0;
		while(temp!=null){
			len++;
			temp=temp.next;
		}
		temp=head;
		for(int i=1;i<(len-n+1);i++){
			temp=temp.next;
		}
		System.out.println("\nThe element at position "+n+" from last is "+temp.data);
	}
}
