package com.hanshunping.datastructures.stack.self;

/**
 * Created by jgsoft on 2020/5/16.
 */
public class FruitStack {

    public int top;

    public String[] arr;

    public int maxSize;

    public FruitStack(int size) {
        this.top = -1;
        this.arr = new String[size];
        this.maxSize = size;
    }

    public void push(String str) {
        if (top == maxSize - 1) {
            System.out.println("栈满了");
            return;
        }

        top = top + 1;
        arr[top] = str;
    }

    public String pop() {
        String str = arr[top];
        top = top - 1;
        return str;
    }

    public void getAll() {
        for (int i = top; i > -1; i--) {
            System.out.println(arr[i]);
        }
    }



}
