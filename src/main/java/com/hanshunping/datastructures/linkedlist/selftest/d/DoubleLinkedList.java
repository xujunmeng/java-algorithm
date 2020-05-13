package com.hanshunping.datastructures.linkedlist.selftest.d;

/**
 * @author james
 * @date 2020/5/13
 */
public class DoubleLinkedList {

    //定义一个头节点
    public PenNode head = new PenNode(0, "");

    /**
     * 添加
     * 1.遍历找到链表尾节点
     * 2.把链表尾节点的next赋值为添加的节点
     *
     */
    public void add(PenNode penNode) {

        PenNode tempNode = head;
        while (true) {
            //如果临时节点的next为空
            if (tempNode.next == null) {
                tempNode.next = penNode;
                break;
            }
            //如果临时节点的next不为空
            tempNode = tempNode.next;
        }
    }

    /**
     * 遍历
     */
    public void getAll() {
        PenNode tempNode = head;
        while (true) {
            if (tempNode == null) {
                System.out.println("链表为空");
                break;
            }
            System.out.println(tempNode);

            tempNode = tempNode.next;
        }
    }

}
