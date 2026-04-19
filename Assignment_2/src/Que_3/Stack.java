package Que_3;

public class Stack {
	private ListForStack list;
	
	public Stack() {
		list = new ListForStack();
	}
	
	public void push(int val) {
		list.addFirst(val);
	}
	
	public int pop() {
		return list.deleteFirst();
	}
	
	public int peek() {
		return list.getFirst();
	}
}
