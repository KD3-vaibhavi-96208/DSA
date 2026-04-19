package com.sunbeam;




class Node {
    int data;
    Node left, right;
    Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BST {
   
    public int getLevel(Node node, int key, int level) {
        
        if (node == null) 
        	return -1;

       
        if (node.data == key)
        	return level;

        
        if (key < node.data) {
           
            return getLevel(node.left, key, level + 1);
        } else {
            
            return getLevel(node.right, key, level + 1);
        }
    }

    public static void main(String[] args) {
        BST tree = new BST();
        Node root = new Node(10);
        root.left = new Node(5);
        root.right = new Node(15);
        root.left.left = new Node(2);

        int key = 2;
        int level = tree.getLevel(root, key, 1);
        
        if (level != -1) {
            System.out.println("Level of " + key + " is: " + level);
        } else {
            System.out.println("Node not found in BST.");
        }
    }
}
