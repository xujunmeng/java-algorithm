package com.hanshunping.datastructures.linkedlist.selftest;

import com.google.common.collect.Maps;
import com.google.common.collect.Sets;

import java.util.HashMap;
import java.util.Set;
import java.util.Stack;

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

    /**
     * 判断单链表是否有环
     */
    public boolean getRing(FruitNode fruitNode1) {
        FruitNode temp = fruitNode1;

        Set<FruitNode> sets = Sets.newHashSet();
        while (temp != null) {
            if (sets.contains(temp)) {
                return true;
            } else {
                sets.add(temp);
            }

            temp = temp.next;
        }
        return false;
    }

    public boolean getRing2(FruitNode fruitNode1) {
        FruitNode temp = fruitNode1;

        HashMap<FruitNode, FruitNode> map = Maps.newHashMap();

        while (temp != null) {
            if (map.get(temp) != null) {
                return true;
            }
            map.put(temp, temp);

            temp = temp.next;

            if (temp == null) {
                return false;
            }
        }
        return true;
    }

    /**
     * 遍历链表，创建两个类似指针的变量，一个指针每次向后移动一个节点，
     * 一个指针每次移动两个节点，如果遇到两者相同的情况说明存在环
     */
    public boolean getRing3(FruitNode fruitNode1) {
        FruitNode temp1 = fruitNode1;
        FruitNode temp2 = fruitNode1.next;

        while (temp2 != null) {
            if (temp1 == temp2) {
                return true;
            }

            temp1 = temp1.next;
            temp2 = temp2.next.next;

            if (temp2 == null) {
                return false;
            }
        }
        return false;
    }

    /**
     * 遍历法实现链表反转
     */
    public FruitNode reverse1(FruitNode fruitNode) {

        //1.准备两个空节点，newNode用来保存新链表，oldNext用来临时存储原来节点的next节点
        FruitNode newNode = null;
        FruitNode oldNext = null;

        //循环遍历原来节点
        while (fruitNode != null) {

            //原来节点的next节点 存储在 oldNext节点
            oldNext = fruitNode.next;

            //原来节点的next ， 等于了 新的节点
            fruitNode.next = newNode;

            //新的节点 使之等于 原来的节点，
            newNode = fruitNode;

            //上面两个步骤是关键，相当于新的节点等于了原来节点，原来节点的next等于了原来节点


            fruitNode = oldNext;
        }
        return newNode;
    }




    public FruitNode revser3(FruitNode fruitNode) {
        FruitNode newNode = null;
        FruitNode oldNext = null;

        while (fruitNode != null) {
            oldNext = fruitNode.next;

            fruitNode.next = newNode;

            newNode = fruitNode;

            fruitNode = oldNext;
        }
        return newNode;
    }

    //递归实质上就是系统帮你压栈的过程，系统在压栈的时候会保留现场
    public FruitNode reverse4(FruitNode fruitNode) {
        //递归
        if (fruitNode == null || fruitNode.next == null) {
            return fruitNode;
        }

        FruitNode oldNext = fruitNode.next;

        FruitNode newNode = reverse4(oldNext);

        oldNext.next = fruitNode;

        fruitNode.next = null;

        return newNode;


    }




    public void getReverseFruitNode(FruitNode fruitNode) {
        FruitNode temp = head;

        Stack<FruitNode> stack = new Stack<>();
        while (temp.next != null) {
            stack.push(temp.next);

            temp = temp.next;
        }

        while (!stack.empty()) {
            System.out.println(stack.pop());
        }


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
