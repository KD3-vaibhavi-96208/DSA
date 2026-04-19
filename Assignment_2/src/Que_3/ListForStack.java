package Que_3;

public class ListForStack {
	static class Node {
		private int data;
		private Node next;
		
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	
	private Node head;
	
	public ListForStack() {
		this.head = null;
	}
	
	public int isEmpty() {
		if(head == null)
			return 1;
		else
			return 0;
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(head == null) 
			head = newNode;
		else {
			newNode.next = head;
			head = newNode;
		}
	}
	
	public int deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return -1;
		}
		int temp = head.data;
		head = head.next;
		return temp;
	}
	
	public int getFirst() {
		if(head == null) 
			return -1;
		else 
			return head.data;
	}
}
