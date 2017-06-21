package interview;

public class LinkCount {
	Node head;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           LinkCount ll=new LinkCount();
           ll.insertFirst(1);
           ll.insertFirst(2);
           ll.insertFirst(3);
           ll.insertFirst(4);
           ll.count();
	}
public void printList(){
	Node temp=head;
	while(temp!=null){
		System.out.println(temp.data);
		temp=temp.next;
	}
}
public void count(){
   Node temp=head;
   int count=0;
   while(temp!=null){
	   temp=temp.next;
	   count++;
   }
   System.out.println("The no of elements in the list are "+count);
}

public void insertFirst(int d){
	
	Node temp=new Node(d);
	temp.next=head;
	head=temp;
	
}
}
