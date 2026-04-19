package Que_4;

public class Program {

	public static void main(String[] args) {
		List list = new List();
		list.addPosition(1, 10);
		list.addPosition(2, 20);
		list.deletePosisition(2);
		
		list.fDisplay();
	}
}
