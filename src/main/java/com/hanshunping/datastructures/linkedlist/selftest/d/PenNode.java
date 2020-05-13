package com.hanshunping.datastructures.linkedlist.selftest.d;

/**
 * @author james
 * @date 2020/5/13
 */
public class PenNode {

    public Integer no;

    public String name;

    public PenNode next;

    public PenNode pre;

    public PenNode(Integer no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "PenNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                '}';
    }
}
