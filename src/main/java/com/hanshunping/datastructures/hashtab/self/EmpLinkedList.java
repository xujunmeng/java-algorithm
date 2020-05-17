package com.hanshunping.datastructures.hashtab.self;

/**
 * 表示 链表
 * Created by jgsoft on 2020/5/17.
 */
public class EmpLinkedList {
    //头指针，指向第一个Emp,因此我们这个链表的head是直接指向第一个Emp
    private Emp head;//默认为null

    /**
     * 添加雇员到链表
     * 假定，当添加雇员时，id是自增长的，即id的分配总是从小到大，
     * 因此我们将该雇员直接加入到本链表的最后即可
     */
    public void add(Emp emp) {
        //如果是添加第一个雇员
        if (head == null) {
            head = emp;
            return;
        }

        //如果不是第一个雇员，即使用一个辅助指针，帮助定位到最后
        Emp temp = head;
        while (true) {
            if (temp.next == null) {//说明到链表的最后
                break;
            }
            temp = temp.next;//后移
        }
        //退出时直接将emp 加入链表
        temp.next = emp;
    }

    /**
     * 遍历链表的雇员信息
     */
    public void list() {
        if (head == null) {//说明链表为空
            System.out.println("当前链表为空");
            return;
        }
        System.out.println("当前链表的信息为");
        Emp temp = head;//辅助指针
        while (true) {
            System.out.println(temp);
            if (temp.next == null) {//说明temp已经是最后节点
                break;
            }
            temp = temp.next;//后移
        }
    }

    /**
     * 根据id查找雇员
     * 如果查找到，就返回emp，如果没有找到，就返回null
     */
    public Emp findEmpById(int id) {
        //判断链表是否为空
        if (head == null) {
            System.out.println("链表为空");
            return null;
        }
        //辅助指针
        Emp temp = head;
        while (true) {
            if (temp.id == id) {//找到了
                break;//这是temp就是要查找的雇员
            }
            //退出
            if (temp.next == null) {//说明遍历当前链表没有找到该雇员
                temp = null;
                break;
            }
            temp = temp.next;//后移
        }
        return temp;
    }








}
