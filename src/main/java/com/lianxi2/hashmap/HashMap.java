package com.lianxi2.hashmap;

/**
 * @author james
 * @date 2020/9/2
 */
public class HashMap {

    private EmpLinkedList[] empLinkedListArray;

    //表示有多少条链表
    private int size;

    public HashMap(int size) {

        this.size = size;

        empLinkedListArray = new EmpLinkedList[size];

        for (int i = 0; i < size; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    //添加
    public void add(Emp emp) {
        int empNo = emp.id % size;

        empLinkedListArray[empNo].add(emp);
    }

    //遍历
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list(i);
        }
    }


}
