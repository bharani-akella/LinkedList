package interview;
import java.util.*; 
public class LinkInsertAfterKey {
Node head;
	public static void main(String[] args) {
		// TODO Auto-ghilenerated method stub
      Scanner sc=new Scanner(System.in);
		LinkInsertAfterKey ll=new LinkInsertAfterKey();
      System.out.println("Enter four elements");
      ll.insertFirst(sc.nextInt());
      ll.insertFirst(sc.nextInt());
      ll.insertFirst(sc.nextInt());
      ll.insertFirst(sc.nextInt());
      
      System.out.println("Initial list is->");
	  ll.printList();
	  
	  
	  System.out.println("After which value do you want to insert?");
	  int ke=sc.nextInt();
	  System.out.println("Enter the value to insert");
	  int da=sc.nextInt();
	  ll.insertKey(ke, da);
	  ll.printList();
	  
	  
	}
public void printList(){
	Node tnode=head;
	while(tnode!=null){
		System.out.println(tnode.data);
		tnode=tnode.next;
	}
}

public void insertFirst(int d){
	Node n1=new Node(d);
	n1.next=head;
	head=n1;
}

public void insertKey(int key,int d){
	Node temp=head;
	Node inode=new Node(d);
	if(temp!=null && temp.data==key){
		
		inode.next=temp.next;
		temp.next=inode;
	return;
	}
	while(temp!=null && temp.data!=key){
		temp=temp.next;
	}
	if(temp==null){
		System.out.println("Key not present");
		return;
	}
    inode.next=temp.next;
    temp.next=inode;
}
}
