package interview;
import java.util.*;
public class LinkToolKit {
	Node head;
	
	public void printList(){
		Node tnode=head;
		if(head==null){
			System.out.println("No elements in the list");
			System.out.println("Insert an element");
			insertFirst(new Scanner(System.in).nextInt());
		}
		while(tnode!=null){
			System.out.print(tnode.data+"->");
			tnode=tnode.next;
		}
		System.out.println("");
	}
	
	public void showOptions(){
		System.out.println("1.Insert Element");
		System.out.println("2.Delete Element");
		System.out.println("3.See List");
		System.out.println("4.Exit");
		repeatOption();
	}
	
	public void repeatOption(){
		while(true){
			System.out.println("\nWhat do you want to do?");
			Scanner sc=new Scanner(System.in);
	 	    int opt=sc.nextInt();
	 if(opt==4){
		 break;
	 }
	 	    getOption(opt);
      	
		}
		
	}
	
	public void getOption(int opt){
	    
	    	   
	    	switch(opt){
			
			case 1:
				if(head==null){
				System.out.println("Enter the element value to be inserted");
				insertFirst(new Scanner(System.in).nextInt());
				}
			
				while(true){
					Scanner isc=new Scanner(System.in);
					System.out.println("Do you want to insert another element?(yes-1, no-0)");
					int insertOption=isc.nextInt();
					if(insertOption==1){
							System.out.println("Enter key followed by element value");
							insertAfterKey(new Scanner(System.in).nextInt(), new Scanner(System.in).nextInt());		
					       printList();
					       
					}
					else if(insertOption==0){
						System.out.println("Stopping insertion");
						break;
					}else{
						System.out.println("!!!!!!Not an option");
					}
				}
				
			break;
			case 2:
				System.out.println("Do you want to delete element with key(1) or position(2)");
				Scanner sc=new Scanner(System.in);
	            int deleteOption=sc.nextInt();
	            if(deleteOption==1){
	            	System.out.println("Enter the key value to delete");
	            	deleteKey(new Scanner(System.in).nextInt());
	            	printList();
	            }else{
	            	System.out.println("Enter the position to delete(starting with 0)");
	            	deletePosition(new Scanner(System.in).nextInt());
	            	printList();
	            }
				break;			
			case 3:
				printList();
				break;
			case 4:
				System.out.println("Good Bye");
				break;
			}

	    }	
	
	
	public void insertFirst(int d){
		Node n1=new Node(d);
		n1.next=head;
		head=n1;
	}
	
	public void insertMiddle(Node prevNode, int d) {
		// TODO Auto-generated method stub
		 if (prevNode == null)
		    {
		        System.out.println("The given previous node cannot be null");
		        return;
		    }
		Node n4=new Node(d);
		n4.next=prevNode.next;
		prevNode.next=n4;
		
	}
	
	public void insertLast(int d) {
		// TODO Auto-generated method stub
		Node n4=new Node(d);
		
		if(head==null){
			 head=new Node(d);
		return; 
		}
		Node last=head;
		while(last.next!=null){
			last=last.next;
		}
		n4.next=null;
		last.next=n4;
		return;
	}
	
	public void insertAfterKey(int key,int d){
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
	
	public void insertAtPosition(int pos,int d){
		Node temp=head;
		Node inode=new Node(d);
		if(pos==0){
			inode.next=head;
			head=inode;
		}
		for(int i=0;temp.next!=null && i<pos;i++){
			temp=temp.next;
		}
		
		inode.next=temp.next;
		temp.next=inode;
	}

	public void deleteKey(int key){
		Node prev=null,temp=head;
	    if(temp!=null && temp.data==key){
	    	head=temp.next;
	    	return;
	    }
	    while(temp!=null && temp.data!=key){
	    	prev=temp;
	    	temp=temp.next;
	    }
	    if(temp==null){
	    	return;
	    }
	    prev.next=temp.next;
	    
	}
	
	public void deletePosition(int pos){
		  Node	temp=head;
		  Node n1=null;
		  if(pos==0 && temp!=null){
			  head=temp.next;
		  }
		  for(int i=0;i<(pos-1) && temp!=null;i++){
			  temp=temp.next;
			  
		  }
		  if(temp==null && temp.next==null){
			  System.out.println("cannot insert here");
		  return;
		  }
		  n1=temp.next.next;
		  temp.next=n1;
		}
	
}
