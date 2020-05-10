package com.hanshunping.datastructures.linkedlist.selftest;

/**
 * Created by jgsoft on 2020/5/5.
 */
public class SingleLinkedList {

    //定义一个头节点
    public FruitNode head = new FruitNode(0, "");

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

    public FruitNode getReverseFruitNode(FruitNode fruitNode) {
        FruitNode reverseFruitNode = new FruitNode(0, "");

        FruitNode temp = fruitNode;

        if (fruitNode.next == null) {
            System.out.println("链表为空");
            return null;
        }

        while (true) {
            FruitNode tempNextNode = temp.next;
            if (tempNextNode == null) {
                break;
            }

            if (reverseFruitNode.next == null) {
                FruitNode aa = tempNextNode;
                aa.next = null;
                reverseFruitNode.next = aa;
            } else {

                tempNextNode.next = reverseFruitNode.next.next;

                reverseFruitNode.next = tempNextNode;
            }
            temp = temp.next;
        }

        return reverseFruitNode;
    }

    public FruitNode getLastKFruitNode(FruitNode fruitNode, int k) {
        int sumNode = sumNode(fruitNode);

        FruitNode temp = head;
        for (int i = 0; i < sumNode - k; i++) {
            temp = temp.next;
        }
        return temp.next;
    }

    public int sumNode(FruitNode fruitNode) {
        int sumNode = 0;

        FruitNode temp = head;
        while (true) {
            if (temp.next == null) {
                return sumNode;
            }
            sumNode = sumNode + 1;

            temp = temp.next;
        }
    }

    public void deleteNode(FruitNode fruitNode) {
        FruitNode temp = head;

        while (true) {
            if (temp.next == null) {
                System.out.println("未找到");
                break;
            }
            if (temp.next.no == fruitNode.no) {
                temp.next = temp.next.next;
                break;
            }
            temp = temp.next;
        }
    }

    public void updateNode(FruitNode newFruitNode) {
        FruitNode temp = head;
        while (true) {
            if (temp.next == null) {
                System.out.println("未找到");
                break;
            }
            if (temp.next.no == newFruitNode.no) {
                temp.next.name = newFruitNode.name;
                break;
            }
            temp = temp.next;
        }
    }

    /**
     * 按顺序的添加链表
     */
    public void addSort(FruitNode fruitNode) {

        FruitNode temp = head;

        while (true) {
            if (temp.getNext() == null) {
                fruitNode.next = temp.next;

                temp.next = fruitNode;
                break;
            }
            if (temp.getNext().getNo() > fruitNode.getNo()) {
                fruitNode.next = temp.next;

                temp.next = fruitNode;
                break;
            }

            temp = temp.getNext();
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
