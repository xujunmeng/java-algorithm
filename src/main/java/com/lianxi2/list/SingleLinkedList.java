package com.lianxi2.list;

/**
 * @author james
 * @date 2020/8/20
 */
public class SingleLinkedList {

    public HouseNode head = new HouseNode(0);

    /**
     * 添加节点
     * @param houseNode
     */
    public void add(HouseNode houseNode) {
        HouseNode tempNode = head;
        while (tempNode.next != null) {
            tempNode = tempNode.next;
        }
        tempNode.next = houseNode;
    }

    /**
     * 展示所有节点
     */
    public void showAll() {
        HouseNode tempNode = head;
        while (tempNode != null) {
            System.out.print(tempNode);
            tempNode = tempNode.next;
        }
    }

    /**
     * 单链表中有效节点的个数
     * @return
     */
    public int sumNode() {
        if(head == null) {
            return 0;
        }

        int sum = 0;
        HouseNode tempNode = head;
        while(tempNode != null) {
            sum = sum + 1;
            tempNode = tempNode.next;
        }
        return sum;
    }

    /**
     * 把头节点排除掉
     * 单链表中倒数第K个节点
     */
    public HouseNode findLastIndexNode(int k) {
        int len = 0;
        HouseNode cur = head;
        while (cur.next != null) {
            cur = cur.next;
            len++;
        }

        int idx = len + 1 - k;
        int j = 1;
        HouseNode node = head;
        while (j <= idx) {
            node = node.next;
            idx--;
        }
        return node;

    }

    /**
     * 单链表的翻转
     */


}
