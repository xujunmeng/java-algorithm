package com.lianxi2.hashmap;

/**
 * 表示一个链表
 * @author james
 * @date 2020/9/2
 */
public class EmpLinkedList {

    private Emp head;


    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }
        Emp temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = emp;
    }

    public void list(int no) {
        if (head == null) {
            System.out.println("linkedList is empty");
            return;
        }

        Emp temp = head;
        System.out.println("linkedList info " + temp);

        while (temp.next != null) {
            System.out.println("linkedList info " + temp.next);

            temp = temp.next;
        }
    }
}
