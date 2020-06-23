package com.hanshunping.datastructures.hashtab.self;

/**
 * Created by jgsoft on 2020/5/17.
 */
public class HashTab {

    private EmpLinkedList[] empLinkedListArray;
    private int size;

    //构造器
    public HashTab(int size) {
        empLinkedListArray = new EmpLinkedList[size];
        this.size = size;

        //留一个坑,,,这时不要忘记，要分别初始化每个链表
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i] = new EmpLinkedList();
        }
    }

    //添加雇员
    public void add(Emp emp) {
        //根据员工的id，得到该员工应当添加到哪条链表
        int empLinkedListNo = hashFun(emp.id);

        //将emp添加到对应的链表中
        empLinkedListArray[empLinkedListNo].add(emp);
    }

    //遍历所有的链表，遍历hashtab
    public void list() {
        for (int i = 0; i < size; i++) {
            empLinkedListArray[i].list();
        }
    }

    //根据输入的id查找雇员
    public void findEmpById(int id) {
        //使用散列函数，确定到哪条链表查找
        int empLinkedListNo = hashFun(id);
        Emp emp = empLinkedListArray[empLinkedListNo].findEmpById(id);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("没有找到");
        }
    }


    //编写散列函数，使用一个简单取模法
    public int hashFun(int id) {
        return id % size;
    }
}
