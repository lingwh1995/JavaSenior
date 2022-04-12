package com.dragonsoft.datastructure.stack;

import java.util.NoSuchElementException;

public class LinkedListStack {
	
	private LinkedList LinkedList = new LinkedList();
	
	/**
	 * 压栈
	 * @param element
	 */
	public void push(int element) {
		LinkedList.add(element);
	}
	
	/**
	 * 弹栈
	 * @return
	 */
	public int pop() {
		return LinkedList.removeLast();
	}
	
	/**
	 * 查看栈顶元素
	 * @return
	 */
	public int peek() {
		return LinkedList.returnLast();
	}
	
	/**
	 * 查看栈中元素个数
	 * @return
	 */
	public int size() {
		return LinkedList.size();
	}
	
	/**
	 * 打印栈
	 */
	public void show() {
		LinkedList.reverse();
	}
	
}

class LinkedList {
	private Node head = new Node(0);
	
	/**
	 * 添加节点
	 * @param element
	 */
	public void add(int element) {
		Node tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		tempNode.next = new Node(element);
	}
	
	/**
	 * 删除并返回链表中最后一个元素
	 * @return
	 */
	public int removeLast() {
		Node tempNode = head;
		if(tempNode.next == null) {
			throw new NoSuchElementException();
		}
		while(tempNode.next.next != null) {
			tempNode = tempNode.next;
		}
		int element = tempNode.next.data;
		tempNode.next = tempNode.next.next;
		return element;
	}
	
	/**
	 * 返回链表中最后一个元素
	 * @return
	 */
	public int returnLast() {
		Node tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
		}
		return tempNode.data;
	}
	
	/**
	 * 返回链表中节点个数
	 * @return
	 */
	public int size() {
		int size = 0;
		Node tempNode = head;
		while(tempNode.next != null) {
			tempNode = tempNode.next;
			size++;
		}
		return size;
	}
	
	/**
	 * 打印链表
	 */
	public void reverse() {
		reverse(head);
	}
	
	/**
	 * 递归打印链表
	 * @param head
	 */
	public void reverse(Node head) {
		if(head.next == null) {
			return;
		}
		reverse(head.next);
		System.out.println(head.next.data);
	}
	
	/**
	 * 打印链表
	 */
	public void show() {
		Node tempNode = head;
		if(tempNode.next == null) {
			System.out.println("链表为空...");
			return;
		}
		while(tempNode.next != null) {
			tempNode = tempNode.next;
			System.out.println(tempNode);
		}
	}
}

class Node{
	protected int data;
	protected Node next;
	
	public Node(int data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
}