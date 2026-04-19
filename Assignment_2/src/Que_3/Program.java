package Que_3;

public class Program {

	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(50);
		st.push(40);
		st.push(30);
		
		System.out.println("Popped element : " + st.pop());
		System.out.println("Peek element : " + st.peek());

	}

}
