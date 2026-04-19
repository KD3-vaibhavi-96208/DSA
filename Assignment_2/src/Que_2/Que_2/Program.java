package Que_2;

import java.util.Scanner;

public class Program {
	public static void accept(Employee emp) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter id : ");
		int id = sc.nextInt();
		emp.setId(id);
		System.out.println("Enter name : ");
		String name = sc.next();
		emp.setName(name);
		System.out.println("Enter salary : ");
		double salary = sc.nextDouble();
		emp.setSalary(salary);
	}

	public static void main(String[] args) {
		List list = new List();
		Employee emp = new Employee();
		Program.accept(emp);
		list.addEmployeeLast(emp);
		list.addEmployeeLast(new Employee(2, "Mohan", 300));
		list.addEmployeeLast(new Employee(3, "Ramesh", 400));
		list.addEmployeeLast(new Employee(4, "Nitin", 500));
		
		list.deleteEmployee();
		list.displayEmployee();
		
		list.searchByName("Karan");

		list.updateBySalary();
		list.displayEmployee();
	}

}
