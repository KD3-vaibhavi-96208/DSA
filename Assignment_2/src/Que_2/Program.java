package Que_2;

import java.util.Scanner;

public class Program {
	static Scanner sc = new Scanner(System.in);
	public static void accept(Employee emp) {
		System.out.print("Enter id : ");
		int id = sc.nextInt();
		emp.setId(id);
		System.out.print("Enter name : ");
		String name = sc.next();
		emp.setName(name);
		System.out.print("Enter salary : ");
		double salary = sc.nextDouble();
		emp.setSalary(salary);
	}
	
	public static int menuList() {
		System.out.println("0. Exit");
		System.out.println("1. Add Employee");
		System.out.println("2. Display Employee");
		System.out.println("3. Delete Employee");
		System.out.println("4. Search Employee");
		System.out.println("5. Update Employee");
		System.out.println("6. Sort Employee");
		int choice;
		System.out.println("Enter choice : ");
		choice = sc.nextInt();
		return choice;
	}

	public static void main(String[] args) {
		List list = new List();
		int choice;
		while((choice = menuList()) != 0) {
			Employee emp = new Employee();
			switch(choice) {
			case 1 :
				Program.accept(emp);
				list.addEmployeeLast(emp);
				break;
			case 2 : 
				list.displayEmployee();
				break;
			case 3 :
				System.out.print("Enter id to delete Employee : ");
				int id = sc.nextInt();
				list.deleteEmployeeById(id);
				//list.deleteEmployee();
				break;
			case 4 :
				System.out.println("Enter name to search : ");
				String name = sc.next();
				list.searchByName(name);
				break;
			case 5 :
				System.out.print("Enter id of employee : ");
				int empid = sc.nextInt();
				System.out.print("Enter salary to update : ");
				double salary = sc.nextDouble();
				list.updateBySalary(empid, salary);
				break;
			case 6 :
				list.sortBySalary();
				break;
			}
		}

	}

}
