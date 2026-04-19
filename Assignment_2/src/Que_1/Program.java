package Que_1;

public class Program {

	public static void main(String[] args) {
		List list = new List();
		list.addFirst(10);
		list.addLast(20);
		list.addPosition(1, 5);
		list.deletePosition(1);
		
		list.display();
		

	}

}
