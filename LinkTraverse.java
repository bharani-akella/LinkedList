package interview;

import java.util.*;

public class LinkTraverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		Scanner sc=new Scanner(System.in);
      LinkTraverse lt=new LinkTraverse();
      Node n1=new Node(1);
      Node n2=new Node(2);
      Node n3=new Node(3);
      n1.next=n2;
      n2.next=n3;
      lt.printList(n1);
      }
	public void printList(Node h) {
		// TODO Auto-generated method stub
                while(h!=null){
                	System.out.println(h.data);
                	h=h.next;
                }
		}
	}
	


