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

                penNode.pre = tempNode;

                break;
            }
            //如果临时节点的next不为空
            tempNode = tempNode.next;
        }
    }

    /**
     * 按顺序的添加链表
     */
    public void addSort(PenNode penNode) {

        PenNode temp = head;


        while (true) {
            if (temp.next == null) {
                temp.next = penNode;
                penNode.pre = temp;
                break;
            }
            if (penNode.no < temp.next.no) {

                penNode.next = temp.next;

                temp.next.pre = penNode;

                penNode.pre = temp;

                temp.next = penNode;

                break;
            }

            temp = temp.next;

        }


    }



    public void deleteNode(PenNode penNode) {
        PenNode temp = head.next;

        while (true) {
            if (temp == null) {
                System.out.println("not found");
                break;
            }
            if (temp.no.intValue() == penNode.no.intValue()) {

                temp.pre.next = temp.next;

                temp.next.pre = temp.pre;

                break;
            }
            temp = temp.next;
        }
    }


    /**
     * 遍历
     */
    public void getAll() {
        PenNode tempNode = head;
        while (true) {
            if (tempNode == null) {
                System.out.println("linked list empty");
                break;
            }
            System.out.println(tempNode);

            tempNode = tempNode.next;
        }
    }

}
