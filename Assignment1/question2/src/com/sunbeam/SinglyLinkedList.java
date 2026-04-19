package com.sunbeam;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head;

  
    public void insertAfter(int key, int value) {
        Node temp = head;

        while (temp != null) {
            if (temp.data == key) {
                Node newNode = new Node(value);
                newNode.next = temp.next;
                temp.next = newNode;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Key not found");
    }


    public void insertBefore(int key, int value) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        
        if (head.data == key) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
            return;
        }

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            if (curr.data == key) {
                Node newNode = new Node(value);
                prev.next = newNode;
                newNode.next = curr;
                return;
            }
            prev = curr;
            curr = curr.next;
        }

        System.out.println("Key not found");
    }

    
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        System.out.print("Original List: ");
        list.display();

        list.insertAfter(20, 25);
        System.out.print("After insertAfter(20,25): ");
        list.display();

        list.insertBefore(30, 28);
        System.out.print("After insertBefore(30,28): ");
        list.display();
    }
}