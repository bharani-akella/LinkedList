package interview;

public class DeleteList {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             DeleteList ll=new DeleteList();
             ll.insertFirst(10);
             ll.insertFirst(20);
             ll.insertFirst(30);
             ll.insertFirst(40);
             ll.insertFirst(50);
             ll.printList();
             ll.deleteList();
             ll.printList();
             
	}
	
	public void deleteList(){
		head=null;
	}
	public void printList(){
		if(head==null){
			System.out.println("\nList is empty");
		}
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
}
