package com.bridgelabz.linkedlistprograms;


import java.util.LinkedList;
class Node {
	int data;
	Node next;


public class LinkedListTest {

	public static void main(String[] args) {
		// Creating nodes
		Node<Integer> node1 = new Node<>(70);
		Node<Integer> node2 = new Node<>(30);
		Node<Integer> node3 = new Node<>(56);

		// Linking nodes to create a linked list
		node1.setNext(node2);
		node2.setNext(node3);

		// Printing the linked list
		Node<Integer> current = node1;
		while (current != null) {
			System.out.print(current.getData() + "->");
			current = current.getNext();
		}
		System.out.print("null");
	}

	private int data;
	private Object next;	public void Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class Node<K> 
{
	private final K data;
	private Node<K> next;
class LinkedList {
	Node head;

	public Node(K data) {
		this.data = data;
		this.next = null;
	}
	public LinkedList() {
		this.head = null;
	}

	public K getData() {
		return data;
	}
	public void append(int data) {
		Node new_node = new Node(data);
		if (head == null) {
			head = new_node;
		} else {
			Node current = head;
			while (current.next != null) {
				current = current.next;
			}
			current.next = new_node;
		}
	}

	public void setNext(Node<K> next) {
		this.next = next;
	}
	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("null");
	}
}

	public Node<K> getNext() {
		return next;
public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList myList = new LinkedList();
		myList.append(56);
		myList.append(30);
		myList.append(70);

		myList.printList(); // prints: 56->30->70->null
	}
}
	}

	
	
			
	
