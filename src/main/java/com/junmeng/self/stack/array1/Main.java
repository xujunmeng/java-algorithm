package com.junmeng.self.stack.array1;

/**
 * Created by jgsoft on 2019/2/23.
 */
public class Main {

    public static void main(String[] args) {
        StackX stackX = new StackX(10);

        while (true) {
            if (stackX.isNotFull()) {
                int val = (int)(Math.random()*100);
                stackX.push(val);
            } else {
                break;
            }
        }
        while (stackX.isNotEmpty()) {
            Object val = stackX.pop();
            System.out.println(val);
        }

    }

}
