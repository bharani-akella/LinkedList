package interview;

public class LinkDataAtPosition {
Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
             LinkDataAtPosition ll=new LinkDataAtPosition();
             ll.insertFirst(1);
             ll.insertFirst(2);
             ll.insertFirst(3);
             ll.insertFirst(4);
             ll.insertFirst(5);
             ll.dataAtPosition(4);
             
	}
	public void printList(){
		Node temp=head;
		while(temp!=null){
			System.out.println(temp.data);
			temp=temp.next;
		}
	}
	
	public void insertFirst(int d){
		
		Node temp=new Node(d);
		temp.next=head;
		head=temp;
		
	}
	
	public void dataAtPosition(int index){
		int count=0;
		Node temp=head;
		while(temp!=null){
			if(count==index){
				System.out.println("Data at index "+index+" is +"+temp.data);
				break;
			}
			count++;
			temp=temp.next;
			}
		if(temp==null){
			System.out.println("Index not present");
		}
		
	}
}
