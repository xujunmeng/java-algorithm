package com.hanshunping.datastructures.hashtab.self2;

/**
 * Created by jgsoft on 2020/5/23.
 */
public class HashTab {

    public EmpLinkedList[] arr;

    public int size;

    public HashTab(int size) {

        arr = new EmpLinkedList[size];

        this.size = size;

        for (int i = 0; i < size; i++) {
            arr[i] = new EmpLinkedList();
        }
    }

    public int funHahs(Integer id) {
        return id % size;
    }

    public void add(Emp emp) {
        int no = funHahs(emp.id);
        arr[no].add(emp);
    }
}
