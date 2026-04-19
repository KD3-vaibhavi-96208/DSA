package Que_4;

// doubly circular
public class List {
	static class Node {
		private int data;
		private Node next;
		private Node prev;
		
		public Node(int val) {
			this.data = val;
			this.next = null;
			this.prev = null;
		}
	}
	
	private Node head;
	private int size;
	
	public List() {
		this.head = null;
		this.size = 0;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void fDisplay() {
		if(head == null)
			return;
		Node trav = head;
		System.out.print("List elements : ");
		do {
			System.out.print(trav.data + " ");
			trav = trav.next;
		} while (trav != head);	
		System.out.println();
	}
	
	public void bDisplay() {
		if(head == null)
			return;
		Node trav = head.prev;
		System.out.print("List elements : ");
		do {
			System.out.print(trav.data + " ");
			trav = trav.prev;
		} while(trav != head.prev);
		System.out.println();	
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;   // add node in empty list
			head.next = newNode; // make list circular. below line also
			head.prev = newNode;
		}
		else {
			newNode.prev = head.prev;
			newNode.next = head;
			head.prev.next = newNode;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;   // add node in empty list
			head.next = newNode;
			head.prev = newNode;
		}
		else {
			newNode.prev = head.prev;
			newNode.next = head;
			head.prev.next = newNode;
			head.prev = newNode;
		}
		size++;
	}
	
	public void addPosition(int pos, int val) {
		if(pos < 1 || pos > size+1) 
			return;
		Node newNode = new Node(val);
		if(pos == 1) {
			addFirst(val);
			return;
		}
		else if(pos == size+1) {
			addLast(val);
			return;
		}
		else {
			Node trav = head;
			for(int i = 1; i < pos-1; i++) {
				newNode.next = trav.next;
				newNode.prev = trav;
				trav.next = newNode;
				newNode.next.prev = newNode;
			}
		}
		size++;
	}
	
	public void deleteFirst() {
		if(head == null)
			return;
		if(head.next == head)
			head = null;
		else {
			head.prev.next = head.next;
			head.next.prev = head.prev;
			head = head.next;
		}
		size--;
	}
	
	public void deleteLast() {
		if(head == null)
			return;
		if(head.next == head) 
			head = null;
		else {
			head.prev = head.prev.prev;
			head.prev.next = head;
		}
		size--;
	}
	
	public void deletePosisition(int pos) {
		if(head == null)
			return;
		if(pos < 1 || pos > size)
			return;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		else if(pos == size) {
			deleteLast();
			return;
		}
		else {
			Node trav = head;
			for(int i = 1; i < pos; i++) 
				trav = trav.next;
			trav.prev.next = trav.next;
			trav.next.prev = trav.prev;
		}
		size--;
	}

}

/*
Singly circular

public class List {
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
	private int size;
	
	public List() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void display() {
		if(head == null)
			return;
		Node trav = head;
		do {
			System.out.println(trav.data + " ");
			trav = trav.next;
		} while(trav != head);
	}
	
	public void addFirst(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = tail = newNode;
			head.next = head;   // make list circular
		}
		else {
			newNode.next = head;
			tail.next = newNode;
			head = newNode;	
		}
		size++;
	}
	
	public void addLast(int val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = tail = newNode;
			head.next = head;
		}
		else {
			newNode.next = head;
			tail.next = newNode;
			tail = newNode;
		}
		size++;
	}
	
	public void addPosition(int pos, int val) {
		if(pos < 1 || pos > size + 1) 
			return;

		Node newNode = new Node(val);
		if(pos == 1) {
			addFirst(val);
			return;
		}
		else if(pos == size+1) {
			addLast(val);
			return;
		}
		else {
			Node trav = head;
			for(int i = 1; i < pos-1; i++) {
				trav = trav.next;
			}
			newNode.next = trav.next;
			trav.next = newNode;
		}
		size++;
	}
	
	public void deleteFirst() {
		if(head == null)
			return;
		else if(head == tail) 
			head = tail = null;
		else {
			head = head.next;
			tail.next = head;
		}
		size--;
	}
	
	public void deleteLast() {
		if(head == null) 
			return;
		else if(head == tail)
			head = tail = null;
		else {
			Node trav = head;
			while(trav.next != tail) 
				trav = trav.next;
			tail = trav;
			tail.next = head;
		}
		size--;
	}
	
	public void deletePosition(int pos) {
		if(head == null)
			return;
		else if(pos < 1 || pos > size) 
			return;
		else if(pos == 1) {
			deleteFirst();
			return;
		}
		else if(pos == size) {
			deleteLast();
			return;
		}
		else {
			Node trav = head;
			for(int i = 1; i < pos-1; i++) 
				trav = trav.next;
			trav.next = trav.next.next;
		}
	}

}
 */



