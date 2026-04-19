package Que_3;


public class ListForQueue {
	static class Node {
		private int data;
		private Node next;
		
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	
	private Node head;
	private Node tail;
	
	public ListForQueue() {
		this.head = null;
		this.tail = null;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void fDisplay() {
		Node trav = head;
		System.out.print("List : ");
		while(trav != null) {   
			System.out.print(trav.data + " ");
			trav = trav.next;
		}
		System.out.println();
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(head == null)
			head = tail = newNode;
		else {
			tail.next = newNode;
			tail = newNode;
		}
	}
	
	
	public int deleteFirst() {
		int temp = -1;
		if(head == null)   // empty list
			return temp;
		if(head == tail)  { // single node
			temp = head.data;
			head = tail = null;
		}
		else {
			temp = head.data;
			head = head.next;
		}
		return temp;
	}
	
	public int getFirst() {
		if(head == null) 
			return -1;
		else 
			return head.data;
	}
	
}
