package com.lianxi2.list;

/**
 * @author james
 * @date 2020/8/20
 */
public class SingleLinkedList {

    public HouseNode head = new HouseNode(0);

    /**
     * 获取头节点
     */
    public HouseNode getHeadNode() {
        return head;
    }

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
        HouseNode tempNode = head.next;
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
     * 查找单链表中倒数第k个节点
     */
    public HouseNode daoshuKNode(int k) {
        //获取总节点数
        int sum = sumNode();

        int m = sum - k;

        HouseNode tempNode = head.next;

        int curr = 1;
        while (curr <= m) {
            tempNode = tempNode.next;
            curr++;
        }
        return tempNode;
    }


    /**
     * 查找单链表中倒数第k个节点
     */
    public HouseNode daoshuKNode2(int k) {
        int sum = sumNode();

        int n = sum - k;

        HouseNode tempNode = head.next;
        int curr = 1;
        while (curr <= n) {
            tempNode = tempNode.next;
            curr++;
        }
        return tempNode;
    }



    /**
     * 单链表的反转
     */
    public HouseNode reverse2(HouseNode houseNode) {

        if (houseNode == null || houseNode.next == null) {
            return houseNode;
        }

        HouseNode oldNodeNext = houseNode.next;

        HouseNode newNode = reverse2(oldNodeNext);

        oldNodeNext.next = houseNode;

        houseNode.next = null;

        return newNode;

    }

    /**
     * 判断单链表是否有环
     */
    public boolean ring2(HouseNode houseNode) {
        HouseNode slowNode = houseNode.next;

        HouseNode node = houseNode.next.next;

        while (true) {
            if (slowNode == null || node == null) {
                return false;
            }

            if (slowNode.date == node.date) {
                return true;
            }
            slowNode = slowNode.next;
            node = node.next.next;
        }
    }





















}
