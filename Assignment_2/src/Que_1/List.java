package Que_1;

public class List {
	static class Node {
		private int data;
		private Node next;
		
		public Node(int val) {
			this.data = val;
			this.next = null;
		}
	}
	
	private Node tail;
	int size;
	
	public List() {
		this.tail = null;
		this.size = 0;
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(tail == null) {
			tail = newNode;
			tail.next = newNode;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
		}
		size++;
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(tail == null) {
			tail = newNode;
			tail.next = newNode;
		}
		else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void addPosition(int pos, int val) {
		if(pos < 1 || pos > size+1) {
			System.out.println("Invalid position");
			return;
		}
		Node newNode = new Node(val);
		if(pos==1) 
			addFirst(val);
		else if(pos == size+1)
			addLast(val);
		else {
			Node trav = tail.next;
			for(int i = 1; i < pos-1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
			size++;
		}
	}
	
	public void deleteFirst() {
		if(tail == null) {
			System.out.println("List is empty");
			return;
		}
		if(tail.next == tail)
			tail = null;
		else
			tail.next = tail.next.next;	
		size--;
	}
	
	public void deleteLast() {
		if(tail == null) {
			System.out.println("List is empty");
			return;
		}
		if(tail.next == tail)
			tail = null;
		else {
			Node trav = tail.next;
			while(trav.next != tail) {
				trav.next = tail.next;
				tail = trav;
			}
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(pos < 1 || pos > size) {
			System.out.println("Invalid position");
			return;
		}
		if(pos==1) 
			deleteFirst();
		else if(pos == size)
			deleteLast();
		else {
			Node trav = tail.next;                                                                                            
			for(int i = 1; i < pos-1; i++) {
				trav = trav.next;
			}
			trav.next = trav.next.next;
		}
		size--;
	}
	
	public void display() {
		if(tail == null) {
			return;
		}
		Node trav = tail.next;
		do {
			System.out.println(trav.data + " ");
			trav = trav.next;
		} while(trav != tail.next);
	}
}
