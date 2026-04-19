package Que_2;

import java.util.Scanner;

class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee() {
		
	}
	
	public Employee(int id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
}

public class List {
	
	static class Node {
		Employee emp;
		Node next;
		
		public Node(Employee emp) {
			this.emp = emp;
			this.next = null;
		}
	}
	
	private Node head;
	
	public List() {
		this.head = null;
	}
	
	Scanner sc = new Scanner(System.in);
	
	public void addEmployeeLast(Employee emp) {
		Node newNode = new Node(emp);
		if(head == null) {
			head = newNode;
		}
		else {
			Node trav = head;
			while(trav.next != null) 
				trav = trav.next;
			trav.next = newNode;
		}
	}
	
	public void displayEmployee() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node trav = head;
		while(trav != null) {
			System.out.println(trav.emp.toString());
			trav = trav.next;
		}
	}
	
	public void deleteEmployee() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		if(head.next == null)
			head = null;
		else {
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}
	
	public void searchByName(String name) {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		Node trav = head;
		boolean found = false;
		while(trav != null) {
			if(trav.emp.getName() == name) {
				System.out.println("Employee found : " + trav.emp.toString());
				found = true;
				return;
			}
			trav = trav.next;
		}
		if(!found) {
			System.out.println("Employee not found");
		}
	}
	
	public void updateBySalary() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.print("Enter id of employee : ");
		int id = sc.nextInt();
		System.out.print("Enter salary to update : ");
		double sal = sc.nextDouble();
		
		Node trav = head;
		boolean found = false;
		while(trav != null) {
			if(trav.emp.getId() == id) {
				trav.emp.setSalary(sal);
				System.out.println("Salary updated");
				found = true;
				return;
			}
			trav = trav.next;
		}
		if(!found) {
			System.out.println("Employee not found");
		}
	}
	
	public void sortBySalary() {
		
	}
}
