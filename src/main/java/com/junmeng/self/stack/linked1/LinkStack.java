package com.junmeng.self.stack.linked1;

/**
 * Created by jgsoft on 2019/2/25.
 */
public class LinkStack {

    private LinkList theList;

    public LinkStack() {
        theList = new LinkList();
    }

    public boolean isEmpty() {
        return theList.isEmpty();
    }

    public void push(long j) {
        theList.insertFirst(j);
    }

    public long pop() {
        return theList.deleteFirst();
    }

    public void displayStack() {
        theList.displayList();
    }

}
