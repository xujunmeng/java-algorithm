package com.lianxi3.two;

import org.junit.Test;

/**
 *
 * 反转一个单链表
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 *
 *
 */
public class TestMain {

    @Test
    public void test() {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        ListNode newNode = reverseList2(node1);

        System.out.println(newNode);
    }

    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next == null) {
            return head;
        }

        ListNode oldNode = head.next;

        ListNode newNode = reverseList(oldNode);

        oldNode.next = head;

        head.next = null;

        return newNode;
    }










    public ListNode reverseList2(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode oldNode = head.next;

        ListNode newNode = reverseList2(oldNode);

        oldNode.next = head;

        head.next = null;

        return newNode;
    }

























}
