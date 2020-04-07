package com.junmeng.self.有序链表;

/**
 * Created by jgsoft on 2019/2/25.
 */
public class Link {

    private long dData;

    private Link next;

    public Link(long dData) {
        this.dData = dData;
    }

    public long getdData() {
        return dData;
    }

    public void setdData(long dData) {
        this.dData = dData;
    }

    public Link getNext() {
        return next;
    }

    public void setNext(Link next) {
        this.next = next;
    }

    public void displayLink() {
        System.out.println(dData + " ");
    }

}
