package com.junmeng.self.stack.linked1;

/**
 * Created by jgsoft on 2019/2/25.
 */
public class Link {

    private long dData;

    private Link next;

    public Link(long dData, Link next) {
        this.dData = dData;
        this.next = next;
    }

    public Link getNext() {
        return next;
    }

    public long getdData() {
        return dData;
    }

    public void displayLink() {
        System.out.println(dData + "  ");
    }

}
