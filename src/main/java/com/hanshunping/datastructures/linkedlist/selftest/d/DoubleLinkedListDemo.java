package com.hanshunping.datastructures.linkedlist.selftest.d;

/**
 * @author james
 * @date 2020/5/13
 */
public class DoubleLinkedListDemo {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        PenNode fruitNode1 = new PenNode(1, "apple");
        PenNode fruitNode2 = new PenNode(2, "pear");
        PenNode fruitNode3 = new PenNode(3, "hami");
        PenNode fruitNode4 = new PenNode(4, "pineapple");

        doubleLinkedList.addSort(fruitNode3);
        doubleLinkedList.addSort(fruitNode1);
        doubleLinkedList.addSort(fruitNode4);
        doubleLinkedList.addSort(fruitNode2);

        doubleLinkedList.deleteNode(fruitNode3);

        doubleLinkedList.getAll();
    }

}
