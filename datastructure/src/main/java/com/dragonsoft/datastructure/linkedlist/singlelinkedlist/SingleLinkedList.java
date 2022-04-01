package com.dragonsoft.datastructure.linkedlist.singlelinkedlist;

/**
 * 单链表
 * @author lingwh
 *
 */
public class SingleLinkedList {
	//构造一个头节点
	private Node headNode = new Node(0,"");
	
	/**
	 * 添加节点
	 * @param node
	 */
	public void addElement(Node node) {
		Node tempNode = headNode;
		while(null != tempNode.next) {
			tempNode = tempNode.next;
		}
		tempNode.next = node;
	}
	
	/**
	 * 在指定位置添加节点
	 * @param node
	 */
	public void addElementByOrder(Node node) {
		Node tempNode = headNode;
		while(null != tempNode.next) {
			if(tempNode.next.elementId > node.elementId) {
				break;
			}else if(tempNode.next.elementId == node.elementId) {
				System.out.println("当前节点："+node+"已经存在，无法添加...");
				break;
			}
			tempNode = tempNode.next;
		}
		//node中的指针指向了本来是tempNode指针指向的元素
		node.next = tempNode.next;
		tempNode.next = node;
	}

	/**
	 * 打印链表
	 */
	public void show() {
		if(null == headNode.next) {
			System.out.println("链表为空......");
			return;
		}
		Node tempNode = headNode.next;
		while(null != tempNode) {
			System.out.println(tempNode);
			tempNode = tempNode.next;
		}
		System.out.println("--------------------------");
	}
}

/**
 * 单链表节点
 * @author lingwh
 *
 */
class Node {
	//数据信息part1：元素编号
	protected int elementId;
	//数据信息part2：数据值
	protected String data;
	//指针信息
	protected Node next;
	
	/**
	 * 节点构造信息
	 * @param elementId
	 * @param data
	 */
	public Node(int elementId, String data) {
		this.elementId = elementId;
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [elementId=" + elementId + ", data=" + data + "]";
	}
	
	
	
}
