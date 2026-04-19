package Que_3;

public class Queue {
	private ListForQueue list;
	
	public Queue() {
		list = new ListForQueue();
	}
	
	public void Enque(int val) {
		list.addLast(val);
	}
	
	public int deque() {
		return list.deleteFirst();
	}
	
	public int peek() {
		return list.getFirst();
	}
	
	
	
}
