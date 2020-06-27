package com.hanshunping.datastructures.queue.selftest;

/**
 * Created by jgsoft on 2020/4/12.
 */
public class MQueue {

    private int maxArrIndex;

    private int front;

    private int rear;

    private Object[] arrData;

    public MQueue(int size) {
        maxArrIndex = size - 1;
        front = -1;
        rear = -1;
        arrData = new Object[size];
    }

    public void add(Object obj) {
        if (isFull()) {
            throw new RuntimeException("满了");
        }
        rear = rear + 1;
        arrData[rear] = obj;
    }

    public void out() {
        if (isEmpty()) {
            throw new RuntimeException("空了");
        }

        front = front + 1;
        arrData[front] = null;

    }

    public void showAll() {
        for (int i = 0; i <= maxArrIndex; i++) {
            System.out.println(arrData[i]);
        }
    }

    public boolean isFull() {
        if (rear >= maxArrIndex) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (front == rear) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        MQueue mQueue = new MQueue(3);
        mQueue.add(10);
        mQueue.add(20);
        mQueue.add(30);

        mQueue.out();

    }

}
