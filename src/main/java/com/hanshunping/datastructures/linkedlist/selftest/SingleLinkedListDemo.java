package com.hanshunping.datastructures.linkedlist.selftest;

/**
 * Created by jgsoft on 2020/5/5.
 */
public class SingleLinkedListDemo {

    public static void main(String[] args) {
        SingleLinkedList singleLinkedList = new SingleLinkedList();

        FruitNode fruitNode1 = new FruitNode(1, "苹果");
        FruitNode fruitNode2 = new FruitNode(2, "鸭梨");
        FruitNode fruitNode3 = new FruitNode(3, "哈密瓜");
        FruitNode fruitNode4 = new FruitNode(4, "菠萝");
        FruitNode fruitNode5 = new FruitNode(5, "西瓜");

//        fruitNode1.next = fruitNode2;
//        fruitNode2.next = fruitNode3;
//        fruitNode3.next = fruitNode4;
//        fruitNode4.next = fruitNode5;
//        fruitNode5.next = fruitNode1;

//        FruitNode fruitNode4New = new FruitNode(4, "菠萝NEW");
//
//        FruitNode fruitNode2Delete = new FruitNode(2, "鸭梨");

        singleLinkedList.add(fruitNode1);
        singleLinkedList.add(fruitNode2);
        singleLinkedList.add(fruitNode3);
        singleLinkedList.add(fruitNode4);
        singleLinkedList.add(fruitNode5);

        FruitNode fruitNode = singleLinkedList.reverse4(fruitNode1);
        System.out.println(fruitNode);

//        singleLinkedList.addSort(fruitNode1);
//        singleLinkedList.addSort(fruitNode3);
//        singleLinkedList.addSort(fruitNode4);
//        singleLinkedList.addSort(fruitNode2);

//        singleLinkedList.sumNode(singleLinkedList.head);
//
//        FruitNode node = singleLinkedList.getLastKFruitNode(singleLinkedList.head, 1);
//        System.out.println(node);
//
//        singleLinkedList.getReverseFruitNode(singleLinkedList.head);
//
//
//        singleLinkedList.updateNode(fruitNode4New);
//        singleLinkedList.deleteNode(fruitNode2Delete);
//        singleLinkedList.getAll();
    }

}
