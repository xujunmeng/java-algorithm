package com.hanshunping.datastructures.linkedlist.selftest;

/**
 * Created by jgsoft on 2020/5/5.
 */
public class SingleLinkedList {

    //定义一个头节点
    private FruitNode head = new FruitNode(0, "");

    /**
     * 添加
     * 1.遍历找到链表尾节点
     * 2.把链表尾节点的next赋值为添加的节点
     *
     */
    public void add(FruitNode fruitNode) {

        FruitNode tempNode = head;
        while (true) {
            //如果临时节点的next为空
            if (tempNode.getNext() == null) {
                tempNode.setNext(fruitNode);
                break;
            }
            //如果临时节点的next不为空
            tempNode = tempNode.getNext();
        }
    }

    /**
     * 遍历
     *
     *
     */
    public void getAll() {
        FruitNode tempNode = head;
        while (true) {
            if (tempNode == null) {
                System.out.println("链表为空");
                break;
            }
            System.out.println(tempNode);

            tempNode = tempNode.getNext();
        }
    }

}
