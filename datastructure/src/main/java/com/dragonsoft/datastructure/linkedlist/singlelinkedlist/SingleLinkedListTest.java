package com.dragonsoft.datastructure.linkedlist.singlelinkedlist;


import org.junit.Test;

/**
 * 测试单链表
 * @author lingwh
 *
 */
public class SingleLinkedListTest {

	@Test
	public void fun() {
		Node node1 = new Node(1,"节点1数据...");
		Node node2 = new Node(2,"节点2数据...");
		Node node3 = new Node(3,"节点3数据...");
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.addElement(node1);
		singleLinkedList.show();
		singleLinkedList.addElement(node2);
		singleLinkedList.show();
		singleLinkedList.addElement(node3);
		singleLinkedList.show();
		Node node4 = new Node(4,"节点4数据...");
		Node node6 = new Node(6,"节点6数据...");
		singleLinkedList.addElementByOrder(node4);
		singleLinkedList.show();
		singleLinkedList.addElementByOrder(node6);
		singleLinkedList.show();
		//测试在节点4和节点6之间插入节点5
		Node node5 = new Node(5,"节点5数据...");
		singleLinkedList.addElementByOrder(node5);
		singleLinkedList.show();
		
		
	}
}
