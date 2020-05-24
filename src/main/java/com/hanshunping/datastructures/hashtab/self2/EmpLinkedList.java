package com.hanshunping.datastructures.hashtab.self2;

/**
 * Created by jgsoft on 2020/5/23.
 */
public class EmpLinkedList {

    public Emp head;

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
}
