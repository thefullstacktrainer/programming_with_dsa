package org.excelr.day4.data_structures;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Insert elements at the end
        linkedList.insertAtEnd(1);
        linkedList.insertAtEnd(2);
        linkedList.insertAtEnd(3);

        // Display the linked list
        linkedList.display();

        // Insert element at the beginning
        linkedList.insertAtBeginning(0);

        // Display the linked list after insertion at the beginning
        linkedList.display();
    }
}

class Node {
    int data;
    Node next;

    // Constructor to create a new node with a given data value
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;

    // Constructor to initialize an empty linked list
    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        // If the list is empty, set the new node as the head
        if (head == null) {
            head = newNode;
        } else {
            // Traverse to the end and append the new node
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
