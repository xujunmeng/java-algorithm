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
        singleLinkedList.add(fruitNode1);
        singleLinkedList.add(fruitNode2);
        singleLinkedList.add(fruitNode3);
        singleLinkedList.add(fruitNode4);
        singleLinkedList.getAll();
    }

}
