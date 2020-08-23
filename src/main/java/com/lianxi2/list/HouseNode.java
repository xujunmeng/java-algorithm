package com.lianxi2.list;

/**
 * @author james
 * @date 2020/8/20
 */
public class HouseNode {

    public int date;

    public HouseNode next;

    public HouseNode(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public HouseNode getNext() {
        return next;
    }

    public void setNext(HouseNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "HouseNode{" +
                "date=" + date +
                ", next=" + next +
                '}';
    }
}
