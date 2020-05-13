package com.hanshunping.datastructures.linkedlist.selftest;

/**
 * Created by jgsoft on 2020/5/5.
 */
public class fruitNode {

    public Integer no;

    public String name;

    public FruitNode next;

    public FruitNode(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

    public Integer getNo() {
        return no;
    }

    public void setNo(Integer no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FruitNode getNext() {
        return next;
    }

    public void setNext(FruitNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "FruitNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
