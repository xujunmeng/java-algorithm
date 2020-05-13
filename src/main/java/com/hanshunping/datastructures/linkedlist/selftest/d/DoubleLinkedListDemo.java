package com.hanshunping.datastructures.linkedlist.selftest.d;

/**
 * @author james
 * @date 2020/5/13
 */
public class DoubleLinkedListDemo {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        PenNode fruitNode1 = new PenNode(1, "苹果");
        PenNode fruitNode2 = new PenNode(2, "鸭梨");
        PenNode fruitNode3 = new PenNode(3, "哈密瓜");
        PenNode fruitNode4 = new PenNode(4, "菠萝");

        doubleLinkedList.add(fruitNode1);
        doubleLinkedList.add(fruitNode2);
        doubleLinkedList.add(fruitNode3);
        doubleLinkedList.add(fruitNode4);

        doubleLinkedList.getAll();
    }

}
