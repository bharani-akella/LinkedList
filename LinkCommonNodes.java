package algo_guru;

import java.util.LinkedList;

public class LinkCommonNodes {
Node head1;
Node head2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkCommonNodes ll=new LinkCommonNodes();

Node one=new Node(1);
Node two=new Node(2);
Node three=new Node(3);
Node four=new Node(4);
Node five=new Node(5);

Node first=new Node(2);
Node second=new Node(3);
Node third=new Node(4);
Node fourth=new Node(5);
Node fifth=new Node(6);

ll.head1=one;
one.next=two;
two.next=three;
three.next=four;
four.next=five;

ll.head2=first;
first.next=second;
second.next=third;
third.next=fourth;
fourth.next=fifth;

System.out.println("List1->");
ll.traverse(ll.head1);
System.out.println("\nList2->");
ll.traverse(ll.head2);
System.out.println("\nCommon Nodes->");

LinkedList<Integer> mylist=new LinkedList();

mylist=ll.commonList(ll.head1, ll.head2);

System.out.println(mylist);

	}

	public void traverse(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
	}

	public LinkedList<Integer> commonList(Node h1,Node h2) {
		LinkedList<Integer> ll3=new LinkedList<Integer>();
		Node t1=h1;
		Node t2=h2;
			
		while(t1.data!=t2.data) {
			t1=t1.next;
		}
		
		
		while(t1!=null && t1.data==t2.data) {
			ll3.add(t1.data);
		
			t1=t1.next;
			t2=t2.next;
			
		}
		return ll3;
	}	
	
}
